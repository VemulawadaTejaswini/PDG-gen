
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		boolean flag=true;
		for(int i=0; i<N;i++) {
			int x= sc.nextInt();
			if(x%2==0&&x%3!=0&&x%5!=0) {
				flag = false;
			}
				
		}
		
		if(flag) {
			System.out.println("APPROVED");
		}else {
			System.out.println("DENIED");
		}
	}

}
