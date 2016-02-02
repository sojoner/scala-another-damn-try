import org.scalatest.FlatSpec

class HelloWorldTest extends FlatSpec {

  "An empty Set" should "have size 0" in {
    assert(Set.empty.size == 0)
  }

  "This numbers" should "not be equal" in {
    val left = 2
    val right = 1
    assert(left != right)
  }

  "This" should "be about vals and vars" in {
    val age:Int = 22
    assert(age == 22)

    var age2:Int = 22
    age2 = 35
    assert(age2 == 35)

    val stringArray:Array[String] = new Array(6)
    assert(stringArray.length == 6)
    // A immutable value can not be reassigned
    //stringArray = new Array(33)
    stringArray(3) = "foo"
    assert(stringArray.apply(3) == "foo")

  }

}
