import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ball = sc.nextInt();
		int color = sc.nextInt();
		long ans = 1;
		for(int i=ball ; i>=1 ;  i--){
			ans = ans*color;
			color--;
		}
		System.out.println(ans);
	}
}