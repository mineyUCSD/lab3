import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = {1,2};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{2,1}, input1);
    
    int[] input2 = {1,2,4,5,7};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{7,5,4,2,1}, input2);
    int[] input3 = {0};
    ArrayExamples.reverseInPlace(input3);
    assertArrayEquals(new int[]{0}, input3);
    int[] input4 = {8,8,8,8};
    ArrayExamples.reverseInPlace(input4);
    assertArrayEquals(new int[]{8,8,8}, input4);
  }


  @Test 
	public void testReverseInPlace2() {
    int[] input1 = {3};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{3}, input1);
	}
}