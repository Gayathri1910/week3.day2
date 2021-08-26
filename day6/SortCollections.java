package assignment6.day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortCollections {
	
	public static void main(String[] args) {
		
		
		String[] array= {"CTS","Wipro","HCL","Aspire Systems"};
		int length1=array.length;
		System.out.println("Length of the array is " +length1);
		List<String> Arraylist = new ArrayList<String>(Arrays.asList(array));
		Collections.sort(Arraylist);
		//System.out.println(Arraylist);
		  for (int i=(Arraylist.size()-1); i>=0; i--) { 
			  System.out.print(Arraylist.get(i)+" ");
		  }
	}

}
