package by.arc.week6

import scala.util.Try

object PhoneParser extends App {

  def getPhoneData(s: String) = {
    val phoneRxp = """.+,\s*(\d{3})\s*-\s*(\d{3})\s*-\s*(\d{4})\s*,.+""".r
    Try {
      val phoneRxp(first, second, third) = s
      (first.toInt, second.toInt, third.toInt)
    }.toOption
  }


  println(getPhoneData("Frank, 123 Main, 925-555-1943,95122"))
  println(getPhoneData("Frank, 123 Main,925   -    555  - 1943   ,95122"))
  println(getPhoneData(
    """Frank, 123 Main,
      |925-
      |555-
      |1943
      |,95122""".stripMargin))
  println(getPhoneData("balhblah"))
}
