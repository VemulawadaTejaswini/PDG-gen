import java.util.Scanner;
 
public class Main {
	static Scanner in = new Scanner(System.in);
 
	public static void main(String[] args) {
		int sx = in.nextInt(), sy = in.nextInt(), tx = in.nextInt(), ty = in.nextInt();
 
		for(int i = 0; i < tx- sx; i++){
			System.out.print("R");
		}
		for(int i = 0; i < ty- sy; i++){
			System.out.print("U");
		}
		for(int i = 0; i < tx- sx; i++){
			System.out.print("L");
		}
		for(int i = 0; i < ty- sy; i++){
			System.out.print("D");
		}
		System.out.print("D");
		for(int i = 0; i < tx- sx + 1; i++){
			System.out.print("R");
		}
		for(int i = 0; i < ty- sy + 1; i++){
			System.out.print("U");
		}
		System.out.print("L");
		for(int i = 0; i < tx- sx + 1; i++){
			System.out.print("L");
		}
		for(int i = 0; i < ty- sy + 1; i++){
			System.out.print("D");
		}
		System.out.println("R");
	}
}