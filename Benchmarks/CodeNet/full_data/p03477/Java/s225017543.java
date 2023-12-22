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
		int v3 = Integer.parseInt(sc.next());
		int v4 = Integer.parseInt(sc.next());
		String ans_str = "";
		int ans_int = 0;
		if(v1+v2>v3+v4){
			ans_str = "Left";
		}else if(v1+v2<v3+v4){
			ans_str = "Right";
		}else{
			ans_str = "Balanced";
		}
		System.out.println(ans_str);
		System.out.flush();
		sc.close();
	}
}