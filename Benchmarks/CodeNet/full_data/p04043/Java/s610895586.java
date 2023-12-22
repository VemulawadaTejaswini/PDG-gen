import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[3];
		for(int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		int count5 = 0;
		int count7 = 0;
		for(int i = 0; i < num.length; i++) {
			if(num[i] == 5) {
				count5++;
			}else if(num[i] == 7) {
				count7++;
			}else {
				break;
			}
		}
		if(count5 == 2 && count7 == 1) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}
