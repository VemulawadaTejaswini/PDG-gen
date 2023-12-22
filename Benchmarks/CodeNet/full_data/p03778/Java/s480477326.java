import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans;
		if(a + w >= b){
			ans = 0;
		}else{
			ans = a + w - b;
		}
		System.out.println(Math.abs(ans));
	}
}