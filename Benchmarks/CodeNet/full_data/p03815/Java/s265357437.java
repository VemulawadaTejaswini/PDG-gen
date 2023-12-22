import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		long x = sc.nextLong();
		long index = 0;
		long count = 0;
		if(x<=5) {
			System.out.println(1);
		}else {
			while(index <= x) {
				index += 5;
				count++;
				if(index >= x) {
					break;
				}
				index += 6;
				count++;
			}
			System.out.println(count);
		}
	}
}
