import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	private static int kaizyou(int n) {
		int ans = 1;
		for(int j = n; j >= 2; j--) {
			ans = ans*j;
		}
		return ans;
	}


	public static void main(String[] args) {

	Scanner sca = new Scanner(System.in);
	// 入力
	int n = sca.nextInt();
	int[] p = new int[n];
	int[] q = new int[n];
    List<Integer> list = new ArrayList<>();
    int c = 0;
    int d = 0;

	int[] zyun = new int[n];
	int[] hikaku = new int[n];

	for(int i = 0; i < n; i++) {
		p[i] = sca.nextInt();
	}
	for(int i = 0; i < n; i++) {
		q[i] = sca.nextInt();
	}

	for(int i = 0; i < kaizyou(n); i++) {
		for(int l = 0; l < n; l++) {
	    	list.add(l+1);
	    }
		int a = i;
		int b = 1;
		for(int j = 1; j <= n; j++) {
			zyun[n - j] = a % b;
			a = a/b;
			b++;
		}
		for(int k = 0; k < n; k++) {
			hikaku[k] = list.get(zyun[k]);
			list.remove(zyun[k]);
		}
		for(int loop = 0; loop < n; loop++) {
			if(hikaku[loop] != p[loop]) {
				break;
			}
			if(loop == n-1) {
				c = i;
			}
		}

		for(int loop = 0; loop < n; loop++) {
			if(hikaku[loop] != q[loop]) {
				break;
			}
			if(loop == n-1) {
				d = i;
			}
		}
	}

	if(c > d) {
		System.out.println(c-d);
	}
	else {
		System.out.println(d-c);
	}
	// 後始末
	sca.close();
	}
}