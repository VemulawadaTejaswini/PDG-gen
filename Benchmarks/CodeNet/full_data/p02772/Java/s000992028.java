import java.util.*;
public class Main {
	public static void main(String[] args){
		String result = "APPROVED";
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if (a % 2 == 0) {
				if (a % 3 == 0 || a % 5 == 0) {
					continue;
                }
				result = "DENIED";
				break;
            }
        }
		System.out.println(result);
	}
}