import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int W, H, x, y;
		W = sc.nextInt();
		H = sc.nextInt();
		x = sc.nextInt();
		y = sc.nextInt();

		double S = (double)W*H/ 2;
		int a = 0;
      if(x*2==W&&y*2==H){
        a=1;
         }
      System.out.println(S+" "+a);
	}
}
