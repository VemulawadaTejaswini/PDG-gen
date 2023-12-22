import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int x = scn.nextInt();
		int y = scn.nextInt();
		int cnt = 0;

		if(Math.abs(x) > Math.abs(y) && x > 0 && y >= 0) {
			x = -x;
			cnt++;
		} else  if(Math.abs(x) > Math.abs(y) && x > 0 && y <= 0) {
			x = -x;
			cnt++;
		} else if(Math.abs(x) < Math.abs(y) && x <= 0 && y > 0) {
			x = -x;
			cnt++;
		} else if(Math.abs(x) > Math.abs(y) && x < 0 && y <= 0) {
			x = -x;
			cnt++;
		}
		
		while(Math.abs(x) != Math.abs(y)){
			x++;
			cnt++;
		}
		
		if(x == -y && x != 0) cnt++;



		System.out.println(cnt);
	}
}