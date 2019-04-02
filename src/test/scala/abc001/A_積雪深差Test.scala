package abc001

import org.scalatest.FunSuite
import support.StdioSupport

class A_積雪深差Test extends FunSuite with StdioSupport {

  test("Sample1") {
    val stdout = actionWithStdIn("15", "10") {
      A_積雪深差.main(Array.empty)
    }
    assert(stdout.values(0) === "5")
  }

  test("Sample2") {
    val stdout = actionWithStdIn("0", "0") {
      A_積雪深差.main(Array.empty)
    }
    assert(stdout.values(0) === "0")
  }

  test("Sample3") {
    val stdout = actionWithStdIn("5", "20") {
      A_積雪深差.main(Array.empty)
    }
    assert(stdout.values(0) === "-15")
  }

}
