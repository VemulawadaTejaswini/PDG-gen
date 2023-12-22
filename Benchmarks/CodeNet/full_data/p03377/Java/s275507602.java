import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<1;i++) {
			int A=sc.nextInt();
			int B=sc.nextInt();
			int X=sc.nextInt();
			
			if(A+B>=X) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
			
			System.out.println("A");
			
		}
		sc.close();
	}
	
}

