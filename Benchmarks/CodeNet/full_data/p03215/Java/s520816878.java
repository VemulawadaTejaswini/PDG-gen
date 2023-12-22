/*
 * :(
 * You taught me so much, I'm not scared anymore
 * 	I have to left go your hands that are holding me
 * 	 Even if I'm alone, I'll go on, even if it hurts
 * 	  I'll never forget the dream, I shared with you
 * 	   I'm glad to be with everyone, I'm glad to have been with everyone
 * 	    But on the morning when I wake up, no one is there
 */
//#define opti
#ifdef opti
#pragma GCC optimize("Ofast,unroll-loops,fast-math")
#pragma GCC target("sse,sse2,sse3,ssse3,sse4,popcnt,abm,mmx,avx,avx2,tune=native")
#endif
#ifndef opti
#pragma GCC optimize("O3")
#endif
#include <bits/stdc++.h>
using namespace std;
#ifndef rd
//#define endl '\n'
#endif
#define pb push_back
#define fi first
#define se second
#define int long long
#define double long double
#define pii pair<int,int>
#define fr(a,b,c) for(int a=b; a<=c; a++)
#define all(con) con.begin(),con.end()
#define shuffle(a,b) random_shuffle(a,b,rng)
#define deb cout<<"Line: "<<__LINE__<<" pls "
typedef long long ll;
const ll mod=1000000007;
const ll inf=1e18;
//const ll mod=998244353;
mt19937 rng(chrono::steady_clock::now().time_since_epoch().count());
ll powm(ll a, ll b, ll m);

int a[1001],prefa[1001];
void solve()
{
	int n,k;
	cin>>n>>k;
	for(int i=1; i<=n; i++) {
		cin>>a[i];
		prefa[i]=prefa[i-1]+a[i];
	}
	int ans=0;
	for(int bit=30; bit>=0; bit--)
	{
		ans=ans+(1<<bit);
		int hol=0;
		for(int i=1; i<=n; i++)
			for(int j=i; j<=n; j++)
			{
				if(((prefa[j]-prefa[i-1])&ans)==ans)
					hol++;
//				cout<<((prefa[j]-prefa[i-1])&ans)<<" "<<ans<<endl;
			}
		if(hol<k)
			ans-=(1<<bit);
	}
	cout<<ans<<endl;
}
signed main()
{
	ios_base::sync_with_stdio(0),cin.tie(0),cout.tie(0);
	srand(chrono::steady_clock::now().time_since_epoch().count());
	#ifdef rd
		clock_t clk = clock();
	#endif
	int t=1;
//	cin>>t;
	while(t--)
		solve();
	#ifdef rd
		clk = clock() - clk;
		cout<<endl<<endl<< "Time Elapsed: " << fixed << setprecision(10) << ((double)clk)/CLOCKS_PER_SEC <<endl;
	#endif
	return 0;
}
ll powm(ll a,ll b, ll m)
{
	ll te=1;
	while(b)
	{
		if(b&1)
			te=(te*a)%m;
		a=(a*a)%m;
		b>>=1;
	}
	return te;
}
