package abc001

import java.io.{BufferedReader, InputStreamReader}

object B_視程の通報 extends App {

  val in = new BufferedReader(new InputStreamReader(System.in))
  val out = System.out

  val distance = in.readLine().toInt
  val vv = distance match {
    case x if x < 100                  => 0
    case x if 100 <= x && x <= 5000    => (x * 10) / 1000
    case x if 6000 <= x && x <= 30000  => (x / 1000) + 50
    case x if 35000 <= x && x <= 70000 => (((x / 1000) - 30) / 5) + 80
    case x if 70000 < x                => 89
  }
  out.println("%02d".format(vv))

}
