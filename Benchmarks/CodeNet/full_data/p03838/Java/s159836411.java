import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args){
		int x = in.nextInt(), y = in.nextInt();
		
		if(0 < x && x < y){
			System.out.println(y - x);
		}else if(y < x && x * y > 0){
			int ans = Math.abs(Math.abs(x) - Math.abs(y));
			System.out.println(ans + 2);
		}else{
			int ans = Math.abs(Math.abs(x) - Math.abs(y));
			System.out.println(ans + 1);
		}
	}
}