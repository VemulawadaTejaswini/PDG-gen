import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = sc.nextInt();
		long integers[] = new long[num];
		for(int i = 0; i < num; i ++) {
			integers[i] = sc.nextLong();
		}
		Arrays.sort(integers);

		long change[][] = new long[count][2];
		for(int i = 0; i < count; i ++) {
			change[i][0] = sc.nextLong();
			change[i][1] = sc.nextLong();
		}
		Arrays.sort(change, (a, b) -> Long.compare(b[1], a[1]));
		int crtIndex = 0;
		int crtCount = 0;
		for(int i = 0; i < num; i ++) {
			if(change[crtIndex][1] < integers[i]) { break; }
			integers[i] = change[crtIndex][1];
			crtCount ++;
			if(crtCount >= change[crtIndex][0]) { crtCount = 0; crtIndex ++; }
			if(crtIndex >= count) { break; }
		}

		long ans = 0;
		for(int i = 0; i < num; i ++) {
			ans += integers[i];
		}

		System.out.println(ans);
	}
}