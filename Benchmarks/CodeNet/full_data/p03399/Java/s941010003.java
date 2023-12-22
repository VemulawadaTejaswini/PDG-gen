import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int max=0;
		int a= stdin.nextInt();
		int b= stdin.nextInt();
		int c= stdin.nextInt();
		int d= stdin.nextInt();
		if(a>b){
			max=max+ b;
		}else{
			max=max+ a;
		}
		if(c>d){
			max=max+d;
		}else{
			max=max+ c;
		}
		System.out.println(max);

	}

}
