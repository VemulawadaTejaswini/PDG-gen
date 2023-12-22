import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		for(int i = 1;i < 100000000; i++){
			if(X == i) {
				System.out.println(i);
				return;
			}else if(X > 2 * i) {
				X = X - i;
			}
		}
	}
}
