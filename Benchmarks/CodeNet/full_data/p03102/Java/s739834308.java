import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int numInt = sc.nextInt();
		int c = sc.nextInt();
		long get[] = new long[numInt];
		for(int i = 0; i < numInt; i ++) {
			get[i] = sc.nextLong();
		}
		long code[][] = new long[num][numInt];
		for(int i = 0; i < num; i ++) {
			for(int j = 0; j < numInt; j ++) {
				code[i][j] = sc.nextLong();
			}
		}
		int count = 0;
		for(int i = 0; i < num; i ++) {
			int tmp = c;
			for(int j = 0; j < numInt; j ++) {
				tmp += code[i][j] * get[j];
			}
			if(tmp > 0) { count ++; }
		}
		System.out.println(count);
	}
}