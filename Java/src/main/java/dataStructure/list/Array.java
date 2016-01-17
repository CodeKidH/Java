package dataStructure.list;

import java.util.Random;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Array {
	
	@Test
	public void arraysDefinitioins(){
		
		final int[] integers = new int[3];
		final boolean[] bools = { false, true, true, false};
		final String[] strings = new String[] {"one","two"};
		
		final Random r = new Random();
		final String[] randomArrayLength = new String[r.nextInt(100)];
	}
	
	//How to resize of array
	@Test
	public void arrayCopy(){
		
		int[] integers = {0,1,2,3,4};
		
		int[] newIntegerArray = new int[integers.length+1]; // init new array length 6
		System.arraycopy(integers, 0, newIntegerArray, 0, integers.length); //make a copy of integers 
		integers = newIntegerArray; // integers refer to newIntegerArray
		integers[5] = 5; // add a index of fifth
		
		assertEquals(5,integers[5]);
	}
}
