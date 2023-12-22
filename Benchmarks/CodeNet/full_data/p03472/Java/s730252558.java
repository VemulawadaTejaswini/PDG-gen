
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int h = sc.nextInt();
		
		int []a = new int [n];
		int []b = new int [n];
		
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		
		sc.close();
		
		Arrays.sort(a);
		Arrays.sort(b);

		
		int max = a[n-1];
		
		int hp = h;
		int cnt = 0;
		int temp = 0;
		
		for(int i = n-1 ; i >= 0 ;i--) {
			if(max < b[i]) {
				hp = hp - b[i];
				cnt++;
			}
			if(hp <= 0){
				temp = -1;
				break;
			}
		}
		
		if(temp == 0) {
		double p = (double) hp/max;
		
		cnt += (int)Math.ceil(p);
		
		System.out.println(cnt);
		
		}
		
		if(temp == -1) {
			System.out.println(cnt);
		}
		
		
		
	}

}
