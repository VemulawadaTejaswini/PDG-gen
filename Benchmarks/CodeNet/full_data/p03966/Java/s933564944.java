import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int tk = 1;
		int ao = 1;
		for (int i = 0; i < n; i++) {
			int t = sc.nextInt();
			int a = sc.nextInt();
			
			int num = 1;
			while (true) {
				if (t * num >= tk && a * num >= ao) {
					tk = t * num;
					ao = a * num;
					break;
				}
				num++;
			}
		}
		
		System.out.println(tk + ao);
		
		sc.close();
	}
}


