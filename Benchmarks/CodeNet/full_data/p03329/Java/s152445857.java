import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int count = 0;
		while(N >= 36) {
			int del9 = 0;
			for (int i = 2; Math.pow(9, i) <= N; i++) {
				del9 = i;
			}
			
			int del6 = 0;
			for (int i = 2; Math.pow(6, i) <= N; i++) {
				del6 = i;
			}
			
			if (Math.pow(6, del6) >= Math.pow(9, del9)) {
				count++;
				N -= Math.pow(6, del6);
			} else {
				count++;
				N -= Math.pow(9, del9);
			} 
		}

		while(N > 0) {
			if (N >= 9 && N - 9 > 5) {
				N -=9;
			} else if (N >= 6) {
				N -=6;
			} else {
				N--;
			}
			count++;
		}
		
		System.out.println(count);
	}
	
}