
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int w = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		if((a <= b && b <= (a + w)) || (b <= a && a <= (b + w))){
			System.out.println(0);
		}else{
			if(a < b){
				System.out.println(b - (a + w));
			}else{
				System.out.println(a - (b + w));
			}
		}

		sc.close();
	}
}
