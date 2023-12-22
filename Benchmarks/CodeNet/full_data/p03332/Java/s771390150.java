import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static final int mod = 998244353;

	static long fact[];
	static long revFact[];

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] tmpArray = br.readLine().split(" ");
		int n = Integer.parseInt(tmpArray[0]);
		long a = Long.parseLong(tmpArray[1]);
		long b = Long.parseLong(tmpArray[2]);
		long sum = Long.parseLong(tmpArray[3]);

		fact = new long[100001];
		fact[0] = 1;
		for(int i = 1; i < fact.length; i++){
			fact[i] = (fact[i - 1] * i)%mod;
		}
		revFact = new long[100001];
		revFact[100000] = repeatablePow((int)fact[100000], mod - 2, mod);
		for(int i = revFact.length - 2; i >= 0 ; i--){
			revFact[i] = (revFact[i + 1] * (i + 1))%mod;
		}

		//test
//		for(int i = 1; i < 101; i++){
//			System.out.println("i = "+i +" "+fact[i]*revFact[i]%mod);
//		}


		long point = 0;
		long result = 0;
		//赤
		for(int i = 0; i <= n; i++){
			point = i * a;
			if(point > sum){
				break;
			}
			//青
			for(int j = 0; j <= n - i; j++){
				point = i * a + j * b;
//				System.out.println("i = "+i+" j = "+j+" "+ point);
				if(point > sum){
					break;
				}
				//緑
				if((sum - point)%(a + b) != 0L ){
					continue;
				}

//				System.out.println("point "+point);
				int green = (int)((sum - point) / (a + b));
				int white = n - i - j - green;
				if(white < 0){
					break;
				}

//				System.out.println("RGBW "+i+" "+green+" "+j+" "+white);

//				System.out.println("sumCheck "+(i*a+j*(b)+green*(a+b)));
				result += permutation(i, green, j, white);
				result %= mod;
			}
		}

		System.out.println(result);

	}

	static long permutation(int a, int b, int c, int d){
		int n = a + b + c + d;

		long result = fact[n];
		if(a != 0) //result = result * repeatablePow((int)fact[a], mod - 2, mod) % mod;
			result = (result * revFact[a])%mod; //
//		System.out.println("p1 "+result);
		if(b != 0) result = (result * revFact[b])%mod; //result * repeatablePow((int)fact[b], mod - 2, mod) % mod;
//		System.out.println("p2 "+result);
		if(c != 0) result = (result * revFact[c])%mod; //result * repeatablePow((int)fact[c], mod - 2, mod) % mod;
//		System.out.println("p3 "+result);
		if(d != 0) result = (result * revFact[d])%mod; //result * repeatablePow((int)fact[d], mod - 2, mod) % mod;
//		System.out.println("p4 "+result);

		return result;
	}

	static long repeatablePow(int x, int n, int mod){
        if(n == 0){
            return 1;
        }
        long result = repeatablePow((int)((long)x*x%mod), n/2, mod);
        if(n % 2 == 1){
            result = result*x%mod;
        }
        return result;
    }

}
