import java.util.ArrayList;
import java.util.Scanner;

 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> numList = new ArrayList<>();
		int ans = 0;
		
		for(int i = 0; i < N; i++) {
			numList.add(sc.nextInt());
		}
		
		int min = numList.get(0);
		for(int i = 0; i < N; i++) {
			if(numList.get(i) < min) {
				min = numList.get(i);
			}
			
			if(numList.get(i) <= min) {
				ans++;
			}
		}
		
		System.out.println(ans);
		sc.close();
	}
}