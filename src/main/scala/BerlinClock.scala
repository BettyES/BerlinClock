

object BerlinClock {

  def main(args: Array[String]): Unit = {
    var n = "02:00:00"
    var ClockActual = new BClock(n)


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
  var hh5: Int = hh/5
  var hh1 = hh%5

  for(x<-0 to hours5.length-1){
    if(x <= hh5){hours5(x) = "R"
    }else{hours5(x) = "O"}
  }
  //for(x<-0 to times(0).toInt){hours5(x) = "R"}

  //}
}