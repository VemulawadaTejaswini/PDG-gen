import java.util.Scanner;


public class Main {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int counter=0;
		
		for(int i=0;i<n;i++) {
			
			int buf=sc.nextInt();
			
			if(buf%2==1) {
				counter++;
			}
			
		}
		
		if(counter%2==0) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}


		sc.close();


	}



}
