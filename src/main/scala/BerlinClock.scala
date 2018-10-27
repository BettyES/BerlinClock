

object BerlinClock {

  def main(args: Array[String]): Unit = {
    println("Enter the time with following format (hh:mm:ss):")

    var n = scala.io.StdIn.readLine()

    var ClockActual = new BClock(n)
    println(ClockActual.hours5.mkString("|"))
    println(ClockActual.hours1.mkString("|"))
    println(ClockActual.minutes5.mkString("|"))
    println(ClockActual.minutes1.mkString("|"))
  }

}

class BClock(time: String){
  var hours5 = new Array[String](4)
  var hours1 = new Array[String](4)
  var minutes5 = new Array[String](11)
  var minutes1 = new Array[String](4)

  //var timesComplete = new Array[String](3)
  var timesComplete = time.split(":")
  var hh = timesComplete(0).toInt
  var hh5: Int = hh / 5
  var hh1 = hh % 5

  var mm = timesComplete(1).toInt
  var mm5: Int = mm / 5
  var mm1 = mm % 5

  for (x <- 0 to hours5.length - 1) {
    if (x < hh5) {
      hours5(x) = "R"
    } else {
      hours5(x) = "O"
    }
  }

  for(x<-0 to hours1.length-1) {
    if (x < hh1) {
      hours1(x) = "R"
    } else {
      hours1(x) = "O"
    }
  }

  for (x <- 0 to minutes5.length - 1) {
    if (x < mm5 && (x+1) % 3 == 0) {
      minutes5(x) = "R"
    } else if (x < mm5) {
      minutes5(x) = "Y"
    } else {
      minutes5(x) = "O"
    }
  }

  for (x <- 0 to minutes1.length - 1) {
    if (x < mm1 ) {
      minutes1(x) = "Y"
    } else {
      minutes1(x) = "O"
    }
  }
}