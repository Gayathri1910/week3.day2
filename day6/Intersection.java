package assignment6.day6;

import java.util.ArrayList;
import java.util.List;

public class Intersection {

	public static void main(String[] args) {
		int Arr[] = { 3, 2, 11, 4, 6, 7 };
		int Arr1[] = { 1, 2, 8, 4, 9, 7 };
		List<Integer> List1 = new ArrayList<Integer>(Arr.length);
		for (Integer integer1 : Arr) {
			List1.add(integer1);
		}
		System.out.println(List1);
		List<Integer> List2 = new ArrayList<Integer>(Arr1.length);
		for (Integer integer2 : Arr1) {
			List2.add(integer2);
		}
		System.out.println(List2);
		List1.retainAll(List2);
		System.out.println("THE INTERSECTION OF LISTS");
		System.out.println(List1);
	}
}
