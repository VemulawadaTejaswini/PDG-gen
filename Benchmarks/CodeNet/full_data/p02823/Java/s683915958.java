import java.util.Scanner;
public class Main {
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	long N=sc.nextLong();
	long A=sc.nextLong();
	long B=sc.nextLong();
	if((B-A)%2==0) {
		System.out.println((B-A)/2);
	}else {
		if(N-B<=A-1) {
			System.out.println((2*N-B-A)/2+1);
		}else {


			System.out.println((A+B-2)/2+1);


		}

	}


	}
}