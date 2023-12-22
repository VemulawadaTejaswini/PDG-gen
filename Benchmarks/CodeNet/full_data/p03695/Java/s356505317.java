package ProCon;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		boolean[] b = new boolean[8];
		Arrays.fill(b, false);
		int c = 0;
		for(int i = 0 ; i < n; i++){
			int a = scanner.nextInt();
			if(a < 400){
				b[0] = true;
			}else if (a < 800) {
				b[1] = true;
			}else if (a < 1200) {
				b[2] = true;
			}else if (a < 1600) {
				b[3] = true;
			}else if (a < 2000) {
				b[4] = true;
			}else if (a < 2400) {
				b[5] = true;
			}else if (a < 2800) {
				b[6] = true;
			}else if (a < 3200) {
				b[7] = true;
			}else {
				c++;
			}
		}
		int ans = 0;
		for(int i = 0; i < 8; i++){
			if(b[i]){
				ans++;
			}
		}
		if(ans + c >= 8){
			System.out.println(Math.max(1, ans) + " " + 8);
		}else{
			if(n == 0){
				System.out.println(0 + " " + 0);
			}else{
			System.out.println(Math.max(1, ans) + " " + (ans+c));
			}
		}
	}
}
