package assignment6.day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int[] arr = { 14, 12, 13, 11, 15, 13, 14, 18, 16, 17, 19, 18, 17, 20 };
		Arrays.sort(arr);
		List<Integer> list1=new ArrayList<Integer>();
		List<Integer> list2=new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					list2.add(arr[i]);
				}
			}
			list1.add(arr[i]);
		}
		list1.removeAll(list2);
		System.out.println("AFTER REMOVAL OF DUPLICATES");
		System.out.println(list1);
	}

}
