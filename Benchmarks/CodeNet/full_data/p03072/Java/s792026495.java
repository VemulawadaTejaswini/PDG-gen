import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		int max = 0;
		for(int i = 0; i < num; i ++) {
			int crt = sc.nextInt();
			if(crt >= max) {
				count ++;
			}
			max = Math.max(max, crt);
		}
		System.out.println(count);
	}
}