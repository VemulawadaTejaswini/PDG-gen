#include<bits/stdc++.h>

using namespace std;
#define ll long long

const int N = 10005, P = 1000000007;
int n, ans, a[N], f[1000005];
int Pow(ll x, int y=P-2){
	int ans=1;
	for(; y; y>>=1, x=x*x%P) if(y&1) ans=ans*x%P;
	return ans;
}
int main() {
	scanf("%d", &n);
	for(int i=1; i<=n; ++i){
		scanf("%d", a+i);
		int x=a[i];
		for(int j=2; j*j<=x; ++j) if(x%j==0){
			int cnt=1;
			while((x/=j)%j==0) ++cnt;
			f[j]=max(f[j], cnt);
		}
		if(x>1) f[x]=max(f[x], 1);
	}
	int s=1;
	for(int i=1; i<=1000000; ++i) while(f[i]--) s=(ll)s*i%P;
	for(int i=1; i<=n; ++i) ans=(ans+(ll)s*Pow(a[i]))%P;
	printf("%d\n", ans);
	return 0;
}

