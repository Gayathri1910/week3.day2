package assignment6.day6;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicateString {
	
	public static void main(String[] args) {
		String text="We learn java basics as part of java sessions in java week1";
		String[] splitxt = text.split(" ");
		String Result=" ";
		LinkedHashSet<String> set = new LinkedHashSet<String>( Arrays.asList(splitxt));
		for (String stringch : set) {
			Result=Result+stringch+" ";
		}
		System.out.println(Result);
	}

}
