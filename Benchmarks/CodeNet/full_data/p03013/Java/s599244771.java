import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = br.readLine().split(" ");

		int N = Integer.parseInt(str[0]);
		int M = Integer.parseInt(str[1]);

		int[] a = new int[M];
		for(int i=0;i<M;i++) {
			a[i] = Integer.parseInt(br.readLine());
		}

		int pa = 0;



		int n = 0;
		int r = 0;

		long ans = 1;
		for(int i = 0;i<M;i++) {
			if(i ==0) {
				n = a[i]-1;
				r = 0;
				while(n>=r) {
					pa += calcNumOfCombination(n, r);

					n -= 1;
					r += 1;
				}

			}else {

				n = (a[i]-1)-(a[i-1]+1);
				r = 0;
				while(n>=r) {
					pa += calcNumOfCombination(n, r);

					n -= 1;
					r += 1;
				}

			}
			ans = ans * pa;
			pa = 0;
		}

		n = N-(a[M-1]+1);
		r = 0;
		while(n>=r) {
			pa += calcNumOfCombination(n, r);

			n -= 1;
			r += 1;
		}

		ans = ans * pa;

		ans = ans % 1000000007;

		System.out.println(ans);

	}


    static int calcNumOfCombination(int n, int r){
        int num = 1;
        for(int i = 1; i <= r; i++){
            num = num * (n - i + 1) / i;
        }
        return num;
    }
}
