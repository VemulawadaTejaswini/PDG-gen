import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main (String [] args){
		List <Integer> list = new ArrayList<Integer>();
		HashMap <Integer, Integer>hm = new HashMap<Integer, Integer>();
		int v1 = Integer.parseInt(sc.next());
		int v2 = Integer.parseInt(sc.next());
//		String s2 = sc.next();		
		String ans_str = "";
		int ans_int = 0;
		
		
		if(v1 * v2 > v1-v2){
			if(v1*v2> v1+v2){
				ans_int = v1*v2; 
			}else{
				ans_int = v1 + v2;
			}
		}else{
			if(v1-v2> v1+v2){
				ans_int = v1 - v2;
			}else{
				ans_int = v1 + v2;
			}
		}
		System.out.println(ans_int);
		System.out.flush();
		sc.close();
	}
}