#include <bits/stdc++.h>

using namespace std;

#define DBG cerr << '!' << endl;
#define REP(i,n) for(ll (i) = (0);(i) < (n);++i)
#define rep(i,s,g) for(ll (i) = (s);(i) < (g);++i)
#define rrep(i,s,g) for(ll (i) = (s);i >= (g);--(i))
#define PB push_back
#define MP make_pair
#define FI first
#define SE second
#define SHOW1d(v,n) {for(int W = 0;W < (n);W++)cerr << v[W] << ' ';cerr << endl << endl;}
#define SHOW2d(v,i,j) {for(int aaa = 0;aaa < i;aaa++){for(int bbb = 0;bbb < j;bbb++)cerr << v[aaa][bbb] << ' ';cerr << endl;}cerr << endl;}
#define ALL(v) v.begin(),v.end()
#define Decimal fixed<<setprecision(10)
#define INF 1000000000
#define MOD 1000000007
#define PI 3.14159265359

typedef long long ll;
typedef pair<ll,ll> P;

int main()
{
	int n;cin >> n;
	vector<int> A(n);
	vector<int> B(n);
	
	REP(i,n)cin >> A[i];
	REP(i,n)cin >> B[i];
	
	int ans = 0;
	
	REP(i,30)
	{
		vector<int> v(2*n);
		REP(j,n)
		{
			v[2*j] = B[j] % (1 << (i+1));
			v[2*j+1] = B[j] % (1 << (i+1)) + (1 << (i+1));
		}
		sort(ALL(v));
		int cou = 0;
		REP(j,n)
		{
			int	up = lower_bound(ALL(v),4*(1<<i) - (A[j]%(1<<(i+1)))) - v.begin();
			int lo = lower_bound(ALL(v),3*(1<<i) - (A[j]%(1<<(i+1)))) - v.begin();
			cou += up - lo;
			cou %= 2;
		}		
		ans |= (cou << i);
	}
	
	cout << ans << endl;
	
	return 0;
}
