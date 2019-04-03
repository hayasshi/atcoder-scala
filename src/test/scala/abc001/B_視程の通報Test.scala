package abc001

import org.scalatest.FunSuite
import support.StdioSupport

class B_視程の通報Test extends FunSuite with StdioSupport {

  test("Sample1") {
    val stdout = actionWithStdIn("15000") {
      B_視程の通報.main(Array.empty)
    }
    assert(stdout.values(0) === "65")
  }

  test("Sample2") {
    val stdout = actionWithStdIn("75000") {
      B_視程の通報.main(Array.empty)
    }
    assert(stdout.values(0) === "89")
  }

  test("Sample3") {
    val stdout = actionWithStdIn("200") {
      B_視程の通報.main(Array.empty)
    }
    assert(stdout.values(0) === "02")
  }

}
