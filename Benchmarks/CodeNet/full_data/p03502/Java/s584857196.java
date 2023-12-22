import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main (String [] args){
		List <Integer> list = new ArrayList<Integer>();
		HashMap <Integer, Integer>hm = new HashMap<Integer, Integer>();
//		int v1 = Integer.parseInt(sc.next());
		String s2 = sc.next();		
		String ans_str = "";
		int ans_int = 0;
		int[]ints = null;
		for(int i = 0;i < s2.length();i++){
			ans_int += (Integer.valueOf(String.valueOf(s2.charAt(i))));
		}
		if(Integer.parseInt(s2)%ans_int == 0){
			ans_str = "Yes";
		}else{
			ans_str = "No";
		}
		System.out.println(ans_str);
		System.out.flush();
		sc.close();
	}
}