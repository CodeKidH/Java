package dataStructure.map;

import java.util.HashMap;
import static org.junit.Assert.assertEquals;
import java.util.Map;

import org.junit.Test;

public class HashMap_overwriteKey {
	
	@Test
	public void overwriteKey(){
		
		final Map<String, String>preference = new HashMap<>();
		preference.put("like", "jacuzzi");
		preference.put("dislike","stram room");
		
		assertEquals("jacuzzi",preference.get("like"));
		
		//overwriteKey
		preference.put("like","sauna");
		
		assertEquals("sauna",preference.get("like"));
	}
}
