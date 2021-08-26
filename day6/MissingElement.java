package assignment6.day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingElement {
	
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		Arrays.sort(arr);
		List<Integer> list = new ArrayList<Integer>();
		for (Integer intlist : arr) {
			list.add(intlist);
		}
		for (int i = 0; i < arr.length; i++) {
			int j = i + 1;
			if (list.get(i) != j) {
				System.out.println("THE MISSING ELEMENTS IN AN ARRAY IS:"+j);
				break;
			}
		}
	}

}
