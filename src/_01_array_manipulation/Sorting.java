package _01_array_manipulation;

public class Sorting {

	public static void sort(String[] testArray) {
		
		for (int e = 0; e < testArray.length - 1; e++) {
		for (int i = 0; i < testArray.length - 1; i++) {
			
			if (testArray[i].compareTo(testArray[i+1]) > 0){
				String temp = testArray[i +1];
				testArray[i+ 1] = testArray[i];
				testArray[i] = temp;
				
			}
			
			
		}
		
	
		}
		
		
		
	}

}
