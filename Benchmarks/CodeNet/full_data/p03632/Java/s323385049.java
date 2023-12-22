import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(),B = sc.nextInt(),C = sc.nextInt(),D = sc.nextInt();
		int t1,t2;
		if(D<=A || B<=C)System.out.print(0);
		else {
			t1=(int)Math.max(C,A);
			t2=(int)Math.min(D,B);
			System.out.print(t2-t1);
		}
		sc.close();
	}
}