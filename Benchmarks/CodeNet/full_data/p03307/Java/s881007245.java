import java.util.Scanner;
public class Problem1 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a;
		if(n % 2 == 1){
			a = n * 2;
		}
		else{
			a = n;
		}
		System.out.println(a);
	}
}