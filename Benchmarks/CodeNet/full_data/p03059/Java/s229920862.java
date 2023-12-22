import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] list = sc.nextLine().split(" ",0);
		int A = Integer.parseInt(list[0]);
		int B = Integer.parseInt(list[1]);
		int T = Integer.parseInt(list[2]);

		System.out.println(B*(T/A));
		sc.close();
	}

}