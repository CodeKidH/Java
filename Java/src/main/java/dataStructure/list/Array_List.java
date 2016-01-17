package dataStructure.list;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class Array_List {
	
	
	@Test
	public void arrayList(){
		
		ArrayList<String> obj = new ArrayList<String>();
		
		obj.add("hello"); //0
		obj.add("hi"); //1
		obj.add("good");//2
		obj.add("goodmorning");//3
		
		assertEquals("hello",obj.get(0));
		
        obj.add(2, "goodNight");
		
        assertNotSame("good",obj.get(2));
		
		obj.remove(0);
		
		assertEquals("hi",obj.get(0));
		
	}
	
	//How to convert an array to ArrayList
	@Test
	public void convert(){
		
		String[] greet = {"hello","hi","goodsmorging"};
		
		List<String> greetList = new ArrayList<>(Arrays.asList(greet));
		
		greetList.add("goodevening");
		greetList.add("goodNight");
		
		assertEquals("goodevening",greetList.get(3));
		
	}
	
	// more faster than asList()
	@Test
	public void convert_ver2(){
		
		String[] greet = {"hello","hi","goodsmorging"};
		
		List<String> greetList = new ArrayList<>();
		
		Collections.addAll(greetList, greet);
		
		greetList.add("goodevening");
		greetList.add("goodNight");
		
		assertEquals("goodevening",greetList.get(3));
		
	}
	
	//How to convert an arrayList to array
	@Test
	public void convert_ver3(){
		
		List<String> obj = new ArrayList<>();
		
		obj.add("hello");
		obj.add("hi");
		obj.add("good");
		
		String[] greet = obj.toArray(new String[obj.size()]);
		
		assertEquals("hello",greet[0]);
	}
		
}
