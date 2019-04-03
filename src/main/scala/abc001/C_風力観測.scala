package abc001

import java.io.{BufferedReader, InputStreamReader}

object C_風力観測 extends App {

  val in = new BufferedReader(new InputStreamReader(System.in))
  val out = System.out

  val dirTypes = Vector(
    "N",
    "NNE",
    "NE",
    "ENE",
    "E",
    "ESE",
    "SE",
    "SSE",
    "S",
    "SSW",
    "SW",
    "WSW",
    "W",
    "WNW",
    "NW",
    "NNW"
  )

  def toDir(deg: Int): String =
    dirTypes(((deg * 10 + 1125) / 2250) % 16)

  val wTypes = Vector(
    (0, 0.0, 0.2),
    (1, 0.3, 1.5),
    (2, 1.6, 3.3),
    (3, 3.4, 5.4),
    (4, 5.5, 7.9),
    (5, 8.0, 10.7),
    (6, 10.8, 13.8),
    (7, 13.9, 17.1),
    (8, 17.2, 20.7),
    (9, 20.8, 24.4),
    (10, 24.5, 28.4),
    (11, 28.5, 32.6),
    (12, 32.7, 200.0)
  )

  def toW(dis: Int): Int = {
    val ddis = (BigDecimal(dis) / BigDecimal(60)).setScale(1, BigDecimal.RoundingMode.HALF_UP).toDouble
    wTypes.collectFirst {
      case wType if wType._2 <= ddis && ddis <= wType._3 =>
        wType._1
    }.get
  }

  val Array(deg, dis) = in.readLine().split(" ").map(_.toInt)

  val w = toW(dis)
  val dir = if (w == 0) "C" else toDir(deg)
  out.println(s"$dir $w")

}
