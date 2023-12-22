import java.util.ArrayList;
import java.util.Scanner;

 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		ArrayList<Integer> acList = new ArrayList<>();
		ArrayList<Integer> waList = new ArrayList<>();
		

		for(int i = 0; i < M; i++) {
			int num = sc.nextInt();
			if("AC".equals(sc.next())) {
				//if(!acList.contains(num)) {
				if(acList.get(acList.size()) != num) {
					acList.add(num);
				}
			}else {
				//if(!waList.contains(num)) {
				if(waList.get(acList.size()) != num) {
					waList.add(num);
				}
			}
		}

		System.out.println(acList.size() + " " + waList.size());			
		sc.close();
	}
	
}