package dataStructure.set;

import java.util.HashSet;
import java.util.Set;
import static org.junit.Assert.*;

import org.junit.Test;

public class Set_Simple {
	
	@Test
	public void setExample(){
		
		final Set<String>set = new HashSet<>();
		
		set.add("hello");
		set.add("welcome");
		set.add("goodsbys");
		set.add("hello");  //Set does not allow to overlap
		
		assertEquals(3,set.size());
	}
}
