
import org.scalatest.funspec.AnyFunSpec


class Calculatortest extends  AnyFunSpec {
  describe("Addition") {
    it("Added two number") {
      assert(Calculator.Add(3, 5) === 8)
    }
  }
  describe("Subtraction") {
    it("Subtract two number") {
      assert(Calculator.Sub(5, 2) === 3)
    }
  }

  describe("Multiplication") {
    it("multiply two number") {
      assert(Calculator.Mul(15, 4) === 60)
    }
  }
  describe("Division") {
    it("division two number") {
      assert(Calculator.Div(15, 5) ===3 )
    }
  }
}



