import java.util.Scanner;

public class Main {
	public static void solution(int x, int y) {
		for(int i=0;i<=1e9;i++) {
			if(Math.abs(x-i)==Math.abs(y-i)) {
				System.out.println(i);
			}
		}
	}
		
	
	public static void main(String args []) {
		Scanner obj = new Scanner(System.in);
		int x = obj.nextInt();
		int y = obj.nextInt();
		solution(x,y);
	}
}