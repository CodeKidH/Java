package dataStructure.map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedHashMap_iterator {
	
	@Test
	public void linkedHashMapTraversal(){
		
		final Map<Integer,String> counts = new TreeMap<>();
		//linkedHashMap  doesn't preserve input order
		
		counts.put(4, "four");
		counts.put(1, "one");
		counts.put(3, "three");
		counts.put(2, "two");
		
		final Iterator<Integer> keys = counts.keySet().iterator();
		assertEquals(Integer.valueOf(4),keys.next());
		assertEquals(Integer.valueOf(1),keys.next());
		assertEquals(Integer.valueOf(3),keys.next());
		assertEquals(Integer.valueOf(2),keys.next());
		assertFalse(keys.hasNext());
	}

}
