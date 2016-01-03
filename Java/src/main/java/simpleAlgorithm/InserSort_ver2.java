package simpleAlgorithm;

import java.util.LinkedList;
import java.util.List;

public class InserSort_ver2 {

	
	//2.5,1,7
	
	public static List<Integer> insertSort(List<Integer> numbers){
		
		final List<Integer> sortedList = new LinkedList<>();
		
		origin: for(int i = 0; i<numbers.size(); i++){
			
			int temp = numbers.get(i);;
			
			for(int k = 0; k< sortedList.size(); k++){
				if(temp < sortedList.get(k)){
					sortedList.add(k,temp);
					continue origin;
				}
			}
			
			sortedList.add(i,temp);
			
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
