import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int X1 = sc.nextInt();
		int Y1 = sc.nextInt();
		int X2 = sc.nextInt();
		int Y2 = sc.nextInt();
		
		
		X2 = X2 - X1;
		Y2 = Y2 - Y1;
		
		
		int X3 = X2 - Y2;
		int Y3 = X2 + Y2;
		int X4 = 0 - Y2;
		int Y4 = X2;
		
		X3 = X3 + X1;
		Y3 = Y3 + Y1;
		X4 = X4 + X1;
		Y4 = Y4 + Y1;
		
		
		System.out.println(X3 + " " + Y3 + " " + X4 + " " + Y4);
		
	}
}
