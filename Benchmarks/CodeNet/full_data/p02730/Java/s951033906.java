import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputs = new Scanner(System.in);
		String s = inputs.next();
		int end = 3;
		boolean huh = true;
		int len1 = (s.length()-1)/2;
		int len2 = (s.length()+3)/2;
		if(!palin(s.substring(0,len1))||!palin(s.substring(len2-1))||!palin(s)) {
			huh=false;
		}
		if(huh) {
			System.out.println("Yes");
		}
		else
			System.out.println("No");
	}
	public static boolean palin(String s) {
		String temp = "";
		for(int i=s.length()-1;i>=0;i--) {
			temp+=s.charAt(i);
		}
		if(temp.equals(s)) {
			return true;
		}
		return false;
	}
}
