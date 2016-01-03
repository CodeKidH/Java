package simpleAlgorithm;


public class BubbleSort {
	
	
	public void bubbleSort(int[] numbers){
		
		boolean numbersSwitched;
		int temp;
		
		do{
			numbersSwitched = false;
			for(int i=0; i<numbers.length-1; i++){
				if(numbers[i] > numbers[i+1]){
					temp = numbers[i+1];
					numbers[i+1] = numbers[i];
					numbers[i] = temp;
					numbersSwitched=true;
				}
				
			}
			
		}while(numbersSwitched);
	}
	
}
