import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		char[] t = sc.next().toCharArray();
		int[][] alp = new int[26][s.length+1];
		int front = 0; long count = 0;
		int[] half = new int[26];

		for(int i = 0; i < 26; i++) {
			for(int j = 0; j < s.length+1; j++) {
				alp[i][j] = 0;
			}
		}

		for(int i = 0; i < s.length; i++) {
			int a = s[i] - 97;
			alp[a][0]++;
			alp[a][alp[a][0]] = i;
 		}

		for(int i = 0; i < t.length; i++) {
			int x = t[i] - 97;
			if(alp[x][0] == 0) {
				System.out.println(-1);
				System.exit(0);
			}
		}

		for(int i = 0; i < 26; i++) {
			half[i] = alp[i][alp[i][0]/2+1];
		}

		for(int j = 0; j < t.length; j++) {
			int x = t[j] - 97;
			int last = alp[x][0];

			if(front > alp[x][last]) {
				count++;
				front = alp[x][1]+1;
			}else {
				int a = (front > half[x]) ? alp[x][0]/2+1 : 1;
				while(true) {
					if(alp[x][a] >= front) {
						front = alp[x][a]+1;
						break;
					}
					a++;
				}
			}
		}
		long len = s.length;
		long ans = count*len + front;

		System.out.println(ans);
		sc.close();
	}

}