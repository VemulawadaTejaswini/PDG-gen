import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		int ans = 0;
		
		if(k % 2 ==1) {
		ans =(k+1)*(k-1)/4;
		}
		if(k % 2 == 0) {
		ans =(k * k)/4;
		} 
		System.out.println(ans);

	}

}
