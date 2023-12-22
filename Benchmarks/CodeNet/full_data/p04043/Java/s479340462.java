import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int five = 0;
		int seven = 0;
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 3; i++) {

			int num = Integer.parseInt(sc.next());
			
			switch(num) {
			case 5:
				five++;
				break;
			case 7:
				seven++;
				break;
			}
		}
		if(five == 2 && seven == 1) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}