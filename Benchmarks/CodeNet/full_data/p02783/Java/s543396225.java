import java.util.Scanner;
public class Haw {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float h = sc.nextInt(); // 
		float a = sc.nextInt();
		float ans = h/a;
		System.out.println(Math.ceil(ans));
	}

}
