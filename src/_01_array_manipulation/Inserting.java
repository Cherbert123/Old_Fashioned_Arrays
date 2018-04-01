package _01_array_manipulation;



public class Inserting {

	public static int[] insertAt(int[] testArray, int i, int j) {
		int[] aRay = new int[testArray.length + 1];
		for (int j2 = 0; j2 < i; j2++) {
			aRay[j2] = testArray[j2];
		}
		aRay[i] = j;
		for (int j2 = 0; j2 < testArray.length - i; j2++) {
			aRay[j2 + i + 1] = testArray[j2 + i];
		}
		return aRay;
	}

	public static String[] insertAlphabetically(String[] orderedArray, String string) {
		String[] aRay = new String[orderedArray.length + 1];
		int l = 0;
			for (int i = 0; i < orderedArray.length + 1; i++) {
				l++;
				if (string.compareTo(orderedArray[l]) < 0){
					aRay[i] = string;
					l = l - 1;
				}	else {
					aRay[i] = orderedArray[l];
				}
			}
		return aRay;
	}
	
}
