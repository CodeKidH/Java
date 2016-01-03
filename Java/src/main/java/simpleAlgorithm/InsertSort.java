package simpleAlgorithm;

import java.util.LinkedList;
import java.util.List;

public class InsertSort {
	
	
	public static List<Integer> insertSort(final List<Integer> numbers){
		
		final List<Integer> sortedList = new LinkedList<>();
		
		originalList : for(Integer number: numbers){
			for(int i = 0; i< sortedList.size(); i++){
				if(number < sortedList.get(i)){
					sortedList.add(i, number);
					continue originalList;
				}
			}
			
			sortedList.add(sortedList.size(),number);
		}
		return sortedList;
	}
	
	public static void main(String[] args){
		
		List<Integer> list = new LinkedList<>();
		
		list.add(1);
		list.add(7);
		list.add(3);
		list.add(2);
		
		System.out.println(InsertSort.insertSort(list));
	}
}
