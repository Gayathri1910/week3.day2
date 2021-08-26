package assignment6.day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondLargestNumber {

	
	public static void main(String[] args) {
		int data[] = { 3, 2, 11, 4, 6, 7};// 2,3,4,6,7,11
		Arrays.sort(data);
		List<Integer> list = new ArrayList<Integer>();
		for (Integer intlist : data) {
			list.add(intlist);

		}
		int size1 = list.size();
		System.out.println(list.get(size1 - 2));
	}
}
