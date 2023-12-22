import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double w = (double)(sc.nextInt()),h = (double)(sc.nextInt());
		int x = sc.nextInt(),y = sc.nextInt();
		if(w == h && x == w / 2 && y == h / 2) {
			System.out.print(w*h/2+" ");
			System.out.println(1);
		}else {
			System.out.print(w*h/2+" ");
			System.out.println(0);
		}
	}
}