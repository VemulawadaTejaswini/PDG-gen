import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int []x = new int [4];
		int []y = new int [4];
		
		x[0] = sc.nextInt();
		y[0] = sc.nextInt();
		x[1] = sc.nextInt();
		y[1] = sc.nextInt();
		
		x[2] = x[1] +(y[0] - y[1]);
		y[2] = y[1] +(x[1] - x[0]);
		x[3] = x[2] +(x[0] - x[1]);
		y[3] = y[2] +(y[0] - y[1]);
		
		System.out.println(x[2]+" "+y[2]+" "+x[3]+" "+y[3]);
		
	}

}