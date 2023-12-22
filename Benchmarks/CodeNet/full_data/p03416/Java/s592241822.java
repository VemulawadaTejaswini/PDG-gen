import java.util.Scanner;

public class Main{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = 0;
		int[] k = new int[5];
		
		for(int i = a; i <= b; i ++) {
			int n = i;
			for(int j = 0; j < 5; j ++) {
				k[j] = (n % 10);
				n = n / 10;
				}
			if(k[0] == k[4] && k[1] == k[3]) {
				result ++;
			}
		}
		System.out.println(result);
	}
}
