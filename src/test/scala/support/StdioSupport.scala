package support

import java.io.{ByteArrayInputStream, ByteArrayOutputStream, PrintStream}

case class StdOut(values: Array[String])

trait StdioSupport {

  def actionWithStdIn(inputs: String*)(action: => Unit): StdOut = {
    val orgIn = System.in
    val orgOut = System.out
    val separator = System.lineSeparator()

    val in = new ByteArrayInputStream(inputs.mkString(separator).getBytes)
    val out = new ByteArrayOutputStream()

    System.setIn(in)
    System.setOut(new PrintStream(out))

    try {
      action
      System.setOut(orgOut)
      System.setIn(orgIn)
      StdOut(out.toString.split(separator))
    } finally {
      in.close()
      out.close()
    }
  }

}
