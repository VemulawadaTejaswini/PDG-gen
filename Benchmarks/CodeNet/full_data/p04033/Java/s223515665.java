
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long a=sc.nextLong();
		long b=sc.nextLong();
		if(a*b<=0) {
			System.out.println("Zero");
		}
		else if(a>0 && b>0) {
			System.out.println("Positive");
		}
		else if(a<0 && b<0) {
			long kazu=b-a+1;
			if(kazu%2==1) {
				System.out.println("Negative");
			}
			else {
				System.out.println("Positive");
			}
		}
	}
}
