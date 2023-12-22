import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String data[] = new String[n];

		for (int i = 0;i<n ;i++ ) {
			data[i] = sc.next();
		}

		for (int i = 0;i<n ;i++ ) {
			for (int j = i+1;j<n ;j++ ) {
				if (data[i].equals(data[j])) {
					System.out.println("No");
					System.exit(0);
				}
			}
		}

		for (int i = 0;i<n-1 ;i++ ) {
			if (data[i].charAt(data[i].length()-1)==data[i+1].charAt(0)) {

			}else{
				System.out.println("No");
				System.exit(0);
			}
		}
		System.out.println("Yes");

	}
}
