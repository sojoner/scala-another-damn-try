import org.scalatest.FunSuite

class ClassWithValParameterTest extends FunSuite {

  test("testName") {
    val aClass = new ClassWithValParameter("Gandalf")
    assert(aClass.name == "Gandalf")
  }

}
