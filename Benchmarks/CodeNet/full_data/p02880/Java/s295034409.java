import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int N = sc.nextInt();
		 boolean flg = false;
		 for(int i = 0; i < 9; i++) {
			 for(int j = 0; j < 9; j++) {
				 if(N == i*j) {
					 flg = true;
					 break;
				 }
			 }
		 }
		 if(flg) {
			 System.out.println("Yes");
		 }else {
			 System.out.println("No");
		 }
	}
}
