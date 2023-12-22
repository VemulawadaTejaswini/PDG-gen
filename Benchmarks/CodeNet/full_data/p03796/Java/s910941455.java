import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int a=1;
		int sum;
		for(int i=1;i<=c;i++) {
			a = a*i;
			System.out.println(a);
		}
		sum=  (int) (a % (Math.pow(10, 9)+7));
		System.out.print(sum);
		sc.close();

	}

}