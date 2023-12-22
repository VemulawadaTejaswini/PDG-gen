import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int Z = sc.nextInt();
		int buf;
		buf = X;
		X = Y;
		Y = buf;
		buf = X;
		X = Z;
		Z = buf;
		System.out.print(X + " ");
		System.out.print(Y + " ");
		System.out.println(Z);
	}
}