import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int max = Math.max(a,b);
		int min = Math.min(a,b);
		for(int i =0;i<max;i++) {
			System.out.print(min);
		}
	}

}