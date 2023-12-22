import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		int x = 0;
		int sum = 0;
		for(int i=1; i<=n; i++){
			x = i%10 + i/10;
			if(a <= x & x <= b){
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
