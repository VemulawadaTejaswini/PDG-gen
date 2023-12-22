import java.util.Scanner;

public class Main {
static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {

		int n = s.nextInt();
		int m = s.nextInt();
		
		int sum =0;
		 if(n==1) {
			 sum+=0;
		 }
		 else
			 sum+=((n)*(n-1))/2;
		 
		 if(m==1)
			 sum+=0;
		 else
			 sum+=((m)*(m-1))/2;
		 
		 System.out.println(sum);

	}

}
