import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner f = new Scanner(System.in);
		Scanner v = new Scanner(System.in);
		int N = sc.nextInt();
		int max = f.nextInt();
		int P = max;
		int b;
		for(int i=0;i<N-1;i++) {
			b = v.nextInt();
			if(b>max) {
				max =b;
			}
			P+=b;
		}
		max = max/2;
		P = P-max;
       System.out.println(P);		
	}
}
