import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);
		 int R = sc.nextInt();

		 int G = sc.nextInt();

		 int B = sc.nextInt();

		 int RGB = R * 100 + G * 10 + B;

		 if(RGB % 4 == 0) {
			 System.out.println("Yes");
		 }else {
			 System.out.println("NO");
		 }
	}
}
