import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int a=stdIn.nextInt();
		int b=stdIn.nextInt();

		int c=a+b;
		int d=a-b;
		int e=a*b;

		int max=c;
		if(d>e&&d>c) {
			max=d;
		}else if(c>d&&c>e){
			max=c;
		}else {
			max=e;
		}
		System.out.println(max);
	}

}
