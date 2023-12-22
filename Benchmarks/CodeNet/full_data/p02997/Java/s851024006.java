import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int need = sc.nextInt();
		int max = (num - 1) * (num - 2) / 2;
		if(need > max) {
			System.out.println("-1"); return;
		}
		System.out.println(num - 1 + max - need);
		for(int i = 2; i <= num; i ++) {
			System.out.println("1 "+i);
		}
		int count = 0;
		for(int i = 2; i <= num; i ++) {
			for(int j = i + 1; j <= num; j ++) {
				if(count >= max - need) { break; }
				System.out.println(i+" "+j);
				count ++;
			}
		}
	}
}