import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[n+1];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextLine();
			char temparr[] = arr[i].toCharArray();
			Arrays.sort(temparr);
			arr[i] = new String(temparr);
		}
		arr[n] = "zzzzzzzzzzzzz";
		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		long ans = 0;
		long freq = 1;
		for(int i = 0; i < n; i++) {
				if (arr[i].equals(arr[i + 1])) {
//					System.out.println("cnt");
					freq += 1;
				}
				else if (freq == 1) {
					continue;
				}
				else {
					ans += freq*(freq - 1)/2;
					freq = 1;
				}
		}
		System.out.println(ans);
	}
}