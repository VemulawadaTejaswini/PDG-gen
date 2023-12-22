import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int n= sc.nextInt(),T=sc.nextInt();
	int min = 1010;


	for(Integer i=0; i<n;i++) {
		int c=sc.nextInt();
		int t=sc.nextInt();

		if(t<=T) {
			if(c<min) {
				min=c;

			}
		}
	}
	System.out.println(min<=1000?min:"TLE");
	}
}