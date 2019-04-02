package abc001

import java.io.{BufferedReader, InputStreamReader}

object A_積雪深差 extends App {

  val in = new BufferedReader(new InputStreamReader(System.in))
  val out = System.out
  out.println(in.readLine().toInt - in.readLine().toInt)

}
