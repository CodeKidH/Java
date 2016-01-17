package dataStructure.list;

import java.util.LinkedList;
import static org.junit.Assert.*;
import org.junit.Test;

public class Linked_List {
	
	@Test
	public void linkedList(){
		
		LinkedList<String> obj = new LinkedList<>();
		
		obj.add("hello");
		obj.add("hi");
		obj.add("goodmorning");
		
		obj.addFirst("first");
		obj.addLast("last");
		
		obj.removeFirst();
		obj.removeLast();
		obj.remove(2);
		
	}
	
	@Test
	public void queue(){
		
		
		LinkedList<String> queue = new LinkedList<>();
		
		queue.add("hello");
		queue.add("hi");
		queue.add("goodmorning");
		
		assertEquals("hello",queue.peek());
		
	}
}
