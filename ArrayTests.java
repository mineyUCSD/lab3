import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);

    int[] input2 = {1,2,3,4,5};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{5,4,3,2,1 }, input2);

    int[] input3 = {1,2};
    ArrayExamples.reverseInPlace(input3);
    assertArrayEquals(new int[]{2,1 }, input3);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));

    int[] input2 = {1,2};
    assertArrayEquals(new int[]{2,1}, ArrayExamples.reversed(input2));

    int[] input3 = {1,2,3,4,5};
    assertArrayEquals(new int[]{5,4,3,2,1}, ArrayExamples.reversed(input3));
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] input1 = {};
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input1), .001);
    double[] input2 = {1,2};
    assertEquals(2.0, ArrayExamples.averageWithoutLowest(input2), .001);
    double[] input3 = {1};
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input3), .001);
    double[] input4 = {1, 5, 5, 5};
    assertEquals(5.0, ArrayExamples.averageWithoutLowest(input4), .001);
    double[] input5 = {0,3,3,7,7,8,9};
    assertEquals(6.1667, ArrayExamples.averageWithoutLowest(input5), .001);
    double[] input6 = {0,0,0,3};
    assertEquals(3, ArrayExamples.averageWithoutLowest(input6), .001);
  }

}
