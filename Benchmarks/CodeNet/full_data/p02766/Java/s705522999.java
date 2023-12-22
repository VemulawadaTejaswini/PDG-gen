
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int cnt = 0;
		for (int i = 0;; i++) {
			if (Math.pow(k, i) > n) {
				break;
			}
			cnt++;
		}
		System.out.println(cnt);
	}
}


