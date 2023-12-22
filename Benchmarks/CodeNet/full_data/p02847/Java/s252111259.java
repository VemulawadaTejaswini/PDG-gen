
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String,Integer>hm = new HashMap<String,Integer>();
		
		hm.put("SUN",7);
		hm.put("MON",6);
		hm.put("TUE",5);
		hm.put("WED",4);
		hm.put("THU",3);
		hm.put("FRI",2);
		hm.put("SAT",1);
		
		String s = sc.next();
		
		System.out.println(hm.get(s));


	}

}
