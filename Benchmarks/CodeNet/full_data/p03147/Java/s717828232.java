import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int h[] = new int[N];
		int max = 0;
		for(int i = 0; i < N; i++) {
			h[i] = sc.nextInt();
		}
		
		int h2[] = new int[N];
		int cnt = 0;
		boolean flag = true;
		while(flag) {
		flag = false;
		out : for(int i = 0; i < N; i++) {
			in : for(int j = i; j < N; j++) {
				if(h2[j] < h[j]) {
					flag = true;
					h2[j]++;
					//System.out.println("j" + j + ", h2:" + h2[j]);
				} else {
					if(i == j) {
						if(i == N - 1 && j == N - 1) {
							break out;
						}
						continue out;
					} else {
						//System.out.println(i + "," + j);
						break in;
					}
				}
			}
		//System.out.println(i);
			cnt++;
			i--;
		}
		}
		System.out.println(cnt);
	}
}
