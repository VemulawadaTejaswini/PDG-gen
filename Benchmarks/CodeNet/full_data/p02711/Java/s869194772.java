import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean tt = false;
		for(int i=0;i<3;i++) {
			int t = n % 10;
			 n = n / 10;
			 if(t == 7) {
				 tt = true;
			 }
		}
		if(tt) {
		    System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	
	}
}
