import java.util.Scanner;


public class Main{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int n=scan.nextInt();
			if(n%2==0){
				System.out.println(0.5000000000);
			}
			else{
				int temp=(n+1)/2;
			//	System.out.println((double)temp/n);
				System.out.printf("%.10f\n",(double)temp/n);
			}
		}
	}
}
