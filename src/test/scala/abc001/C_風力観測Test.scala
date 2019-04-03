package abc001

import org.scalatest.FunSuite
import support.StdioSupport

class C_風力観測Test extends FunSuite with StdioSupport {

  test("Sample1") {
    val stdout = actionWithStdIn("2750 628") {
      C_風力観測.main(Array.empty)
    }
    assert(stdout.values(0) === "W 5")
  }

  test("Sample2") {
    val stdout = actionWithStdIn("161 8") {
      C_風力観測.main(Array.empty)
    }
    assert(stdout.values(0) === "C 0")
  }

  test("Sample3") {
    val stdout = actionWithStdIn("3263 15") {
      C_風力観測.main(Array.empty)
    }
    assert(stdout.values(0) === "NNW 1")
  }

  test("Sample4") {
    val stdout = actionWithStdIn("1462 1959") {
      C_風力観測.main(Array.empty)
    }
    assert(stdout.values(0) === "SE 12")
  }

  test("Sample5") {
    val stdout = actionWithStdIn("1687 1029") {
      C_風力観測.main(Array.empty)
    }
    assert(stdout.values(0) === "SSE 8")
  }

  test("Sample6") {
    val stdout = actionWithStdIn("2587 644") {
      C_風力観測.main(Array.empty)
    }
    assert(stdout.values(0) === "WSW 5")
  }

  test("Sample7") {
    val stdout = actionWithStdIn("113 201") {
      C_風力観測.main(Array.empty)
    }
    assert(stdout.values(0) === "NNE 3")
  }

  test("Sample8") {
    val stdout = actionWithStdIn("2048 16") {
      C_風力観測.main(Array.empty)
    }
    assert(stdout.values(0) === "SSW 1")
  }

}
