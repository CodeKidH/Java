package simpleAlgorithm.sortListOut;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

public class ComparableAndComparator {
	
	/*
	 * Comparable
	 * Comparable sort a list out naturally
	 */
	
	// priomitive type(int)
	@Test
	public void sortInts(){ 
		
		final int[] numbers={ -3,-5,1,7,4,-2};
		final int[] expected= { -5,-3,-2,1,4,7};
		
		Arrays.sort(numbers);
		assertArrayEquals(expected, numbers);
	}
	
	//reference type(string)
	@Test
	public void sortObjects(){
		
		final String[] strings = {"z","x","y","abc","zzz","zazzy"};
		final String[] expected ={"abc","x","y","z","zazzy","zzz"};
		
		Arrays.sort(strings);
		assertArrayEquals(expected,strings);
	}
	
	//If type don't support Comparable interface , Body out in person
	@Test
	public void sortNotComparable(){
		final List<NotComparable> objects = new ArrayList<>();
		
		for(int i = 0; i<10; i++){
			objects.add(new NotComparable(i));
		}
		
		try{
			Arrays.sort(objects.toArray());
		}catch(Exception e){
			//not sort it out
		}
	}
	
	/*
	 * Comparator
	 * Comparator sort a list out, as you want
	 */
	
	public class ReverseNumericalOrder implements Comparator<Integer>{
		
		@Override
		public int compare(Integer o1, Integer o2){
			return o2-o1;
		}
		
		@Test
		public void customerSorting(){
			
			final List<Integer> numbers = Arrays.asList(4,7,1,6,3,5,4);
			final List<Integer> expected = Arrays.asList(7,6,5,4,4,3,1);
			
			Collections.sort(numbers, new ReverseNumericalOrder());
		}
	}
}
