import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] s = new String[N];
		for (int i = 0; i < s.length; i++) {
			s[i] = sc.next();
		}

		int[] data = new int[5];
		for (int i = 0; i < s.length; i++) {
			String x = String.valueOf(s[i].charAt(0));
			if (x.equals("M")) {
				data[0]++;
			} else if (x.equals("A")) {
				data[1]++;
			} else if (x.equals("R")) {
				data[2]++;
			} else if (x.equals("C")) {
				data[3]++;
			} else if (x.equals("H")) {
				data[4]++;
			}
		}
		
		int cnt = 0;
		for(int i = 0; i < 5; i++) {
			for(int j = i; j < 5; j++) {
				for(int k = j; k < 5; k++) {
					if((i == j) || (i == k) || (j == k)) {
					} else {
						cnt += data[i] * data[j] * data[k];
					}
				}
			}
		}
		
		System.out.println(cnt);
		sc.close();

	}

}