import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int x = sc.nextInt();
		for(int i = 0; i < n;i++) {
			int a = sc.nextInt();
			for(int j = 0; a * j + 1 <= d;j++) x++;
		}
		System.out.println(x);
	}
}