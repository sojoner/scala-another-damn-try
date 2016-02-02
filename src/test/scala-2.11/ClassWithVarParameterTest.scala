import org.scalatest.FunSuite

/**
  * Created by Sojoner on 02.02.16.
  */
class ClassWithVarParameterTest extends FunSuite {

  test("testDescription") {
    val aClass = new ClassWithVarParameter("Flying character")
    assert(aClass.description == "Flying character")

    aClass.description = "Flying white character"
    assert(aClass.description == "Flying white character")
  }

}
