import java.util.Scanner;


public class Main {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();

		boolean flg=true;
		
		for(int i=0;i<b;i++) {
			
			if(a%b==c) {
				System.out.println("YES");
				flg=false;
				break;
			}
			
		}
		
		if(flg) {
			System.out.println("NO");
		}
		
		
		
		
		
		sc.close();


	}


}

