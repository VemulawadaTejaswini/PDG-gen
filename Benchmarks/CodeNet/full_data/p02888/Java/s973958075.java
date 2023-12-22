import java.util.Scanner;
import java.util.Arrays;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), ans = 0;
		int  b[] = new int[a];
		for(int i = 0; i < a; i++) {
			b[i] = sc.nextInt();
		}
		Arrays.sort(b);
		
		for(int i = 0; i < b.length;i++) {
			for(int j = i + 1; j < b.length; j++) {
				for(int  k = j + 1; k < b.length; k++) {
					if(b[i] + b[j] > b[k]) {
						ans++;
					}
				}	
			}
		}
		
		System.out.println(ans);
	}
}