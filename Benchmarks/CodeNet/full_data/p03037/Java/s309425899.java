import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int min=0;
		int max=0;
		for(int i=0; i<m; i++) {
			min = sc.nextInt();
			max = sc.nextInt();
		}
		if(max > min) {
			System.out.println(max-min+1);
		}else {
			System.out.println(0);
		}
	}
}