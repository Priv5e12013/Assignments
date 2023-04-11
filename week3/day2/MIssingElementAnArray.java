package week3.day2;

import java.util.Arrays;

public class MIssingElementAnArray {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,7,6,8};
		Arrays.sort(array);
		for(int i=0; i<array.length; i++) {
			if(i!=array[i]) {
				System.out.println(array[i]);
			}
		}
		

	}

}
