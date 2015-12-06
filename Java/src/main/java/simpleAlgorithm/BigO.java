package simpleAlgorithm;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BigO {
	
	/*
	 * BigO expression is a method of explaining Algorithm's performance or complexity
	 */	
	
	private int valueOne;
	
	@Parameters
	public static Collection getTestParameters(){
		return Arrays.asList(new Integer[][]{
				{7}	
		});
	}
	
	public BigO(int valueOne){
		this.valueOne = valueOne;
	}
	
	/*
	 * O(1)
	 * Excution time always same, It doesn't care about input date size
     */	
	
	public boolean nullCheck(int n){
		
		if(n == 7){           ////1
			
 			return true;      //1
		}
		
		return false;
	}
	
	@Test
	public void testNullCheck(){
		
		assertEquals(true,nullCheck(valueOne));
	}
	
	
	/*
	 * O(n)
	 * Process time increases with input data 
	 * */ 
	
	public int exl(int n){
		
		int count = 0;              //1
		
		for(int i = 0; i< n; i++){  //n
			count ++;				//n
		}
		
		return count;     //1
	}
	
	@Test
	public void testExl(){
		assertEquals(7,exl(valueOne));
	}
	
	/*
	 * O(n^2)
	 * 
	 * */ 
	public int exl2(int n){
		
		int count = 0;
		
		for(int i = 0; i< n; i++){
			for(int k=0; k<n; k++){
				count ++;
			}
		}
		
		return count;
	}
	
	@Test
	public void testExl2(){
		assertEquals(49,exl2(valueOne));
	}
	
}
