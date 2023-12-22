import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 
 
	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		String Big = input.next();
		String Small = input.next();
		boolean bad = true;
		String ans = "";
		for (int R = Big.length(); R >= 0; R--) {
			int L = R-Small.length();
			if (L>=0) {
				String curString = Big.substring(L,R);
				boolean fit = true;
				for (int i = 0; i < curString.length(); i++) {
					if (curString.charAt(i)!='?') {
						if (Small.charAt(i)!=curString.charAt(i)) {
							fit=false; break;
						}
					}
				}
				if (fit) {
					bad=false;
					for (int i = 0; i < L; i++) {
						if (Big.charAt(i)=='?') ans+="a";
						else ans+=Big.substring(i,i+1);
					}
					ans+=Small;
					for (int i = R; i < Big.length(); i++) { //R is numbered in 1 based indexing, 
						//therefore including R in 0 based indexing works
						if (Big.charAt(i)=='?') ans+="a";
						else ans+=Big.substring(i,i+1);
					}
					break;
				}
			}
		}
		System.out.println(bad?"UNRESTORABLE":ans);
	}
}