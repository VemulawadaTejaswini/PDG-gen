import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count =0;
		for (int i=1;i<=N;i++) {
			String s =String.valueOf(i);
			if (s.length()%2==1)  {
				count ++;
			}
		}
		System.out.println(count);
	}
}