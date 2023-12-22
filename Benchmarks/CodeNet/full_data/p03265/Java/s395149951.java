import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1= sc.nextInt();
		int y1= sc.nextInt();
		int x2=sc.nextInt();
		int y2 =sc.nextInt();
		for (int x3=-200;x3<=200;x3++) {
			for (int y3=-200;y3<=200;y3++) {
				if ((y2-y1)*(y2-y1)+(x2-x1)*(x2-x1)==(y2-y3)*(y2-y3)+(x2-x3)*(x2-x3)) {
					int x4 = x3-(x2-x1);
					int y4 = y3-(y2-y1);
					System.out.println(x3+" "+y3+" " +x4+" "+y4);
					return ;
				}
			}
		}
	}
}