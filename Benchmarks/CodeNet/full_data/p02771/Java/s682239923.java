import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a[] =new int[3];
		int aa = 0;
		int count = 0;

		for (int i = 0;i<3 ;i++ ) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);

		aa = a[0];

		for (int i = 0;i<3 ;i++ ) {
			if (a[i]==aa) {
				count++;
			}
		}

		if (count==2) {
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}

	}
}
