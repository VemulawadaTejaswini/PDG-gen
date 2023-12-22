
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int cnt[] = new int[n+1];
		ModInt ans = new ModInt(1);
		for(int i=2; i<=n; i++) {
			int k=i;
			for(int j=2; j<=i; j++) {
				while(k%j==0) {
					cnt[j]++;
					k /= j;
				}
			}
		}
		for(int i=2; i<=n; i++) {
				ans = ans.mul(new ModInt(cnt[i]+1));
		}
		System.out.println(ans.x);
		sc.close();
	}

}
class ModInt {

	 final static int MOD = 1000000007;
	 public long x;
	 ModInt(long x){
		 this.x = (x % MOD + MOD) % MOD;
	 }
	 public ModInt plus(final ModInt a) {
		 ModInt res = new ModInt(this.x);
		 if((res.x += a.x) >= MOD) {
			 res.x -= MOD;
		 }
		 return res;
	 }
	 public ModInt minus(final ModInt a) {
		 ModInt res = new ModInt(this.x);
		 if((res.x += MOD-a.x) >= MOD) {
			 res.x -= MOD;
		 }
		 return res;
	 }
	 public ModInt mul(final ModInt a) {
		 ModInt res = new ModInt(this.x);
		 res.x *= a.x;
		 res.x %= MOD;
		 return res;
	 }
	 public ModInt pow(long t) {
		 if(t == 0) {
			 return new ModInt(1);
		 }
		 ModInt a = pow(t>>1);
		 a = a.mul(a);
		 if((t&1)==1) {
			 a = a.mul(this);
		 }
		 return a;
	 }
	 public ModInt inv() {
		 ModInt res = pow(MOD-2);
		 return res;
	 }
	 public ModInt div(ModInt a) {
		 ModInt inv = a.inv();
		 return mul(inv);
	 }

}