import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int width = sc.nextInt();
		int cWidth = sc.nextInt()*2;
		int left = width-cWidth;
		System.out.println(left);
		if(width <= cWidth)
			left = 0;
		System.out.println(left);
	}
}