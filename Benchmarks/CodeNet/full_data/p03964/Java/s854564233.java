import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		long s1 = sc.nextLong();
		long s2 = sc.nextLong();
		for(int i = 1; i<N; i++){
			long x1 = sc.nextLong();
			long x2 = sc.nextLong();
			long val1 = s1 / x1;
			long val2 = s2 / x2;
			if(val1 == 0){
				val1 = 1;
				s1 = x1;
			}
			if(val2 == 0){
				val2 = 1;
				s2 = x2;
			}
			if(s1 % x1 != 0){
				val1++;
				s1 = val1 * x1;
			}
			if(s2 % x2 != 0){
				val2++;
				s2 = val2 * x2;
			}
			if(val1 > val2){
				s2 = val1 * x2;
			}
			else if(val2 > val1){
				s1 = val2 * x1;
			}
		}
		long res = s1 + s2;
		System.out.println(res);
	}
}