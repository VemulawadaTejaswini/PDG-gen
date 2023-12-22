
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int count = 1;
		int point = 0;
		
		for(int i=0;i<n;i++) {
			point += sc.nextInt();
			if(point <= x) {
				count++;
			}else {
				break;
			}
		}
		System.out.println(count);
	}

}
