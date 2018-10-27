import org.scalatest.FunSuite

class BerlinClockTest extends FunSuite {
  test("tests 12 am"){
    var c0 = new BClock("00:00:00")
    assert(c0.hours5(0)==="O")
    assert(c0.hours1(0)=="O")
  }

}