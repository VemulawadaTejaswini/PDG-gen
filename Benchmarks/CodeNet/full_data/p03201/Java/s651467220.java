#include <bits/stdc++.h>

using namespace std;

typedef long long ll;
typedef vector<int> vi;
typedef vector<ll> vl;
typedef pair<int,int> pii;
typedef pair<ll,ll> pll;

typedef int _loop_int;
#define REP(i,n) for(_loop_int i=0;i<(_loop_int)(n);++i)
#define FOR(i,a,b) for(_loop_int i=(_loop_int)(a);i<(_loop_int)(b);++i)
#define FORR(i,a,b) for(_loop_int i=(_loop_int)(b)-1;i>=(_loop_int)(a);--i)

#define DEBUG(x) cout<<#x<<": "<<x<<endl
#define DEBUG_VEC(v) cout<<#v<<":";REP(i,v.size())cout<<" "<<v[i];cout<<endl
#define ALL(a) (a).begin(),(a).end()

#define CHMIN(a,b) a=min((a),(b))
#define CHMAX(a,b) a=max((a),(b))

// mod
const ll MOD = 1000000007ll;
#define FIX(a) ((a)%MOD+MOD)%MOD

// floating
typedef double Real;
const Real EPS = 1e-11;
#define EQ0(x) (abs(x)<EPS)
#define EQ(a,b) (abs(a-b)<EPS)
typedef complex<Real> P;

int n;
ll a[252521];

int main(){
  scanf("%d",&n);
  REP(i,n)scanf("%lld",a+i);
  multiset<ll> S;
  REP(i,n)S.insert(a[i]);
  int ans = 0;
  while(S.size()){
    ll x = *S.rbegin(); S.erase(S.find(x));
    ll y;
    FORR(i,0,32){
      ll sum = 1ll<<i;
      y = sum - x;
      if(S.count(y)>0)break;
      y = -1;
    }
    if(y!=-1){
      S.erase(S.find(y));
      ans++;
    }
  }
  printf("%d\n",ans);
  return 0;
}
