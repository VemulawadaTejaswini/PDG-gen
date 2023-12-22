import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int result = 0;
		int temp = 0;
		if(x / 500 >= 1){
			temp = (int)(x / 500);
			result += 1000 * temp;
		}
		temp = x % 500;	
		
		if(temp >= 1){
			result += (int)(temp % 5) * 5;
		}
		System.out.println(result);
	}
}
