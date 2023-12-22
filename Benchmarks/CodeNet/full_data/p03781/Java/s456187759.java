import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long X = Integer.parseInt(sc.next());

		long i = 1;
		long temp = 0;
		while(true) {
			long base = X- (temp+i);
			if(base == i+1) {
				System.out.println(i+1);
				break;
			}else if(base > i+1) {
				temp += i;
				i++;
			}else if(base < i+1) {
				System.out.println(X-temp);
				break;
			}
		}

		sc.close();
	}

}
