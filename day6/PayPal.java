package assignment6.day6;

import java.util.LinkedHashSet;
import java.util.Set;

public class PayPal {
	public static void main(String[] args) {
		String str ="PayPal India";
		String text=str.toLowerCase();
		String text1=text.replaceAll("\\s", "");
		char[] Paystr = text1.toCharArray();
		
		Set<Character> charset	= new LinkedHashSet<Character>();
		Set<Character> dupcharset	= new LinkedHashSet<Character>();
		for (char Ch : Paystr) {
			boolean Unique = charset.add(Ch);
			if(Unique==false) {
				dupcharset.add(Ch);
			}
			
		}
		System.out.println("The Duplicate Character is:"+dupcharset);
		charset.removeAll(dupcharset);
		System.out.println("The Character Set after removing duplicate:"+charset);
	}

}
