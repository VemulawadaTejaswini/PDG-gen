import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		ArrayList<Integer> acList = new ArrayList<>();
		int ac = 0;
		int wa = 0;
		int temp = 0;
		
		for(int i = 0; i < M; i++) {
			int num = sc.nextInt();
			String value = sc.next();
			if(value.equals("AC")) {
				if(!acList.contains(num)) {
					ac++;
					acList.add(num);
					wa += temp;
					temp = 0;
				}
			}else {
				temp++;
			}
		}

		System.out.println(ac + " " + wa);			
		sc.close();
	}
	
}