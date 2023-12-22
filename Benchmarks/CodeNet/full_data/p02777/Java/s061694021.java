import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
 

//result = Math.pow(num1, num3)
//StringBuffer str = new StringBuffer(hoge1);
//String hoge2 = str.reverse().toString();
public class Main {
	private static Scanner sc = new Scanner(System.in);
	static void p(String ans) {System.out.println(ans);};
	static void p(int ans) {System.out.println(ans);};
	static void p(long ans) {System.out.println(ans);};
	//static String eikomoji[]={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	
	
	public static void main(String[] args) {
	String s=sc.next();
	String t=sc.next();
	int a =sc.nextInt();
	int b =sc.nextInt();
	String u=sc.next();
	//Map<String, Integer> map = new HashMap<String, Integer>(n);
	//ArrayList<String> cc = new ArrayList<>(n);
	if(s.equals(u)) {
		a--;
	}else if(t.equals(u)) {
		b--;
	}
	System.out.print(a+" "+b);

	
	
	
	
 }
}