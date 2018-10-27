import org.scalatest.FunSuite

class BerlinClockTest extends FunSuite {
  test("tests 12 am") {
    var c0 = new BClock("00:00:00")
    assert(c0.hours5(0) === "O")
    assert(c0.hours1(0) === "O")
    assert(c0.minutes5(0) === "O")
  }

  test("tests 11 30 am") {
    var c1130 = new BClock("11:30:00")
    assert(c1130.hours5(0) === "R")
    assert(c1130.hours1(0) === "R")
    assert(c1130.minutes5(2) === "Y")
  }

}