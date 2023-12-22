import java.util.HashMap;
import java.util.Scanner;



public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		HashMap<String,Integer> hmap = new HashMap<String,Integer>();

		for(int i = 0 ; i < n; i++) {
			String s;
			s = sc.next();
			if(hmap.get(s)== null) {
				hmap.put(s,1);
			}else {
				hmap.replace(s,(hmap.get(s))+1);
			}
		}
		
		

		int max = 0;

		for(Integer val:hmap.values()) {
			if(val > max) {
				max = val;
			}

		}

		for(String key:hmap.keySet()) {
			if(hmap.get(key)== max) {
				System.out.println(key);
			}
		}




    }

}
