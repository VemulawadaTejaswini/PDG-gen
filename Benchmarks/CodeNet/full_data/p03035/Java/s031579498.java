import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b=sc.nextInt();
		
		if(n>=13){
			System.out.println(b);
		}else if(n>=6){
			System.out.println(b/2);
		}else{
			System.out.println(0);
		}
	}}