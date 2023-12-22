
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean flag = true;
		for(int i = 0; i < n; i++){
			int x = sc.nextInt();
			if(x % 2 == 0){
				if(x % 3 != 0 && x % 5 != 0){
					flag = false;
				}
			}
		}
		System.out.println(flag ? "APPROVED" : "DENIED");
	}
}
