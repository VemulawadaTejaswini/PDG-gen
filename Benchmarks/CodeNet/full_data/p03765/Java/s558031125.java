#include <bits/stdc++.h>
using namespace std;

#define REP(i,n) for(int i=0;i<n;i++)
#define REPR(i,n) for(int i=n;i>=0;i--)
#define FOR(i,m,n) for(int i=m;i<n;i++)
#define EPS (1e-7)
#define INF 1e9

typedef long long ll;
typedef pair<int,int> pii;
typedef pair<ll,ll> pll;
int vx[]={0,1,0,-1};
int vy[]={1,0,-1,0};

int dx[]={0,1,0,-1,1,1,-1,-1};
int dy[]={1,0,-1,0,1,-1,1,-1};

const ll mod=1000000000+7;
const int MAX_N=1000;

int main(){
	string s,t;
	int q;
	cin>>s>>t;
	cin>>q;
	int a[q];
	int b[q];
	int c[q];
	int d[q];
	REP(i,q){
		cin>>a[i]>>b[i]>>c[i]>>d[i];
		a[i]--;b[i]--;c[i]--;d[i]--;
	}

	int sum_s[s.size()+1];
	sum_s[0]=0;
	for(int i=1;i<=s.size();i++){
		if(s[i-1]=='A')sum_s[i]=sum_s[i-1]+1;
		else sum_s[i]=sum_s[i-1]+2;
	}

	int sum_t[t.size()+1];
	sum_t[0]=0;
	for(int i=1;i<=t.size();i++){
		if(t[i-1]=='A')sum_t[i]=sum_t[i-1]+1;
		else sum_t[i]=sum_t[i-1]+2;
	}

	REP(i,q){
		int si=sum_s[b[i]+1]-sum_s[a[i]];
		int ti=sum_t[d[i]+1]-sum_t[c[i]];

		if((si%3)==(ti%3))cout<<"YES"<<endl;
		else cout<<"NO"<<endl;
	}
	return 0;
}