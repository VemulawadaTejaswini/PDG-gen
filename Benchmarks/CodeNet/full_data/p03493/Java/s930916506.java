import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] a = new int[3];
		int cnt = 0;
		for(int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
			if(a[i] == 1) cnt++;
		}
		System.out.println(cnt);
	}
}