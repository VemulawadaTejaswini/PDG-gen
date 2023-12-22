#include<bits/stdc++.h>
using namespace std;

long long FACT[1000000];
long long IFACT[1000000];

static int MOD = 1000000007;
static int mod = MOD;
int modPow(long a, long b) {
 if(b == 0) return 1 % MOD;
 if(b == 1) return (int) (a % MOD);

 if(b % 2 == 0) {
	 long ret = modPow(a % MOD,b / 2) % MOD;
	 return (int)((ret * ret) % MOD);
 }
 else {
	 long ret = (a * (long)modPow(a % MOD,b-1)) % MOD;
	 return (int)(ret % MOD);
 }
}



	long long C(int n, int r)
	{
		if(n < 0 || r < 0 || r > n)return 0;
		if(r > n / 2)r = n - r;
		return FACT[n]*IFACT[n-r]%mod*IFACT[r]%mod;
	}

	long long INV(long v) {
		return modPow(v, MOD - 2);
	}



int main() {
	int N,M,K,n;
	cin >> N >> M >> K;
		n = N + M + K;

		FACT[0] = 1;
		IFACT[0] = 1;
		for(int i = 1;i <= n;i++){
			FACT[i] = FACT[i-1] * i % mod;
			IFACT[i] = INV(FACT[i]);
		}
		long long ans = 0;
		long long hh = 0;
		for(int i = N; i <= N + M + K; i++) {
			int retA = modPow(3,N + M + K - i);

			int retB = (int)C(i-1,N-1);
			long  retC = 0;
			retC = (retC + modPow(2,i - N)) % MOD;
			hh = hh * 2 % MOD;
			if (i - N > M) hh = (hh + C(M + i - N - M - 1, i - N - M - 1)) % MOD;
			if (i - N > K) hh = (hh + C(K + i - N - K - 1, i - N - K - 1)) % MOD;
			retC = (retC - hh) % MOD;
			long ansA = ((long)(retA) * (long)(retB)) % MOD;

			ansA *= retC % MOD;
			ansA %= MOD;
			ans += ansA;
			ans %= MOD;
		}
		cout << ans << endl;
	}
