import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int sum = 0;
		
		if(a > b){
			sum += b;
		}else{
			sum += a;
		}
		
		if(c > d){
			sum += c;
		}else{
			sum += d;
		}
		
		System.out.println(sum);
	}
}