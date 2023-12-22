import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),m=sc.nextInt();
		if(n==m || n%m==0) {
			System.out.println(-1);
		}else {
			System.out.println(n);
		}
	}
}

