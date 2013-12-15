import com.delineneo.P2Exercise
import org.junit.Test
import org.scalatest.junit.AssertionsForJUnit
import org.junit.Assert._

class P2ExerciseTest extends AssertionsForJUnit {

  @Test def builtIn() {
    val result = P2Exercise.penultimateBuiltIt(List(2, 4, 6, 8))
    assertEquals(6, result)
  }

  @Test def recursive() {
    val result = P2Exercise.penultimateRecursive(List(2, 4, 6, 8))
    assertEquals(6, result)
  }
}