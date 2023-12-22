import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String s=in.next();
		String a="";
		for (int i=0;i<s.length();i=i+2)a+=s.charAt(i);
		System.out.println(a);
	}
}