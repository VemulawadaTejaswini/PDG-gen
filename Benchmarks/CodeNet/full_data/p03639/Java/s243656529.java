import java.util.*;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Long> list = new ArrayList<>();
		int count1 = 0;
		int count2 = 0;
		int count4 = 0;
		for (int i = 0; i < N; i++) {
			long num = sc.nextLong();
			int index = 0;
			while (true) {
				if ((num & 1) == 1) {
					break;
				}
				index++;
				num/=2;
			}
			if (index == 0) {
				count1++;
			} else if (index == 2) {
				count2++;
			} else {
				count4++;
			}
		}
		if (0 < count2) {
			count1++;
			count2 = 0;
		}
		System.out.println(count1 <= count4+1 ? "Yes" : "No");
	}
}