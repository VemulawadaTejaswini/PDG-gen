
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int food[] = new int[m];
		
		for(int i=0;i<n;i++) {
			int k = sc.nextInt();
			for(int j=0;j<k;j++) {
				food[sc.nextInt()-1] ++;
			}
		}
		sc.close();
		int count=0;
		for(int num : food) {
			if(num == n) {
				count++;
			}
		}
		System.out.println(count);
	}

}
