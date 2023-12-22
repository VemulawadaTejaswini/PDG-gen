#include <bits/stdc++.h>
using namespace std;

using ll = long long;
#define int long long

#define LOG(variable) cout << #variable":\t" << (variable) << endl
#define LOGCON(i, container) for(int (i) = 0; (i) < (container).size(); ++(i)) cout << (i) << ":\t" << (container)[(i)] << endl
#define REP(i, n) for (int i = 0; i < (n); ++i)
#define REPS(i, r, n) for (int i = (r); i < (n); ++i)
#define REPR(i, n) for(int i = (n); i >= 0; --i) // from n to 0
#define REPRS(i, n, r) for(int i = (n); i >= (r); --i) // from n to r
#define REPOBJ(itr, obj) for(auto itr = (obj).begin(); itr != (obj).end() ; ++itr)
#define REPROBJ(itr, obj) for(auto itr = (obj).rbegin(), e = (obj).rend(); itr != e; ++itr)
#define COUTB(x) cout << (x) << "\n"
#define COUTS(x) cout << (x) << " "
#define PB push_back
#define SORT(obj) sort((obj).begin(), (obj).end())
#define SORTR(obj) sort((obj).begin(), (obj).end(), greater<>())
#define ALL(obj) (obj).begin(), (obj).end()
#define MOD 1000000007
#define PI (acos(-1))
struct mint {
  ll x; // typedef long long ll;
  mint(ll x=0):x((x%MOD+MOD)%MOD){}
  mint operator-() const { return mint(-x);}
  mint& operator+=(const mint a) {
    if ((x += a.x) >= MOD) x -= MOD;
    return *this;
  }
  mint& operator-=(const mint a) {
    if ((x += MOD-a.x) >= MOD) x -= MOD;
    return *this;
  }
  mint& operator*=(const mint a) { (x *= a.x) %= MOD; return *this;}
  mint operator+(const mint a) const { return mint(*this) += a;}
  mint operator-(const mint a) const { return mint(*this) -= a;}
  mint operator*(const mint a) const { return mint(*this) *= a;}
  mint pow(ll t) const {
    if (!t) return 1;
    mint a = pow(t>>1);
    a *= a;
    if (t&1) a *= *this;
    return a;
  }

  // for prime MOD
  mint inv() const { return pow(MOD-2);}
  mint& operator/=(const mint a) { return *this *= a.inv();}
  mint operator/(const mint a) const { return mint(*this) /= a;}
};
istream& operator>>(istream& is, const mint& a) { return is >> a.x;}
ostream& operator<<(ostream& os, const mint& a) { return os << a.x;}
int in() {int x; cin>>x; return x;}
string stin() {string s; cin>>s; return s;}
struct node {
  int value;
  int sum;
  set<int> next_index_set;
};
node nodes[200005];
void CalcSum(int current_index, int current_sum) {
  current_sum += nodes[current_index].sum;
  nodes[current_index].value += current_sum;
  for(auto& itr : nodes[current_index].next_index_set) {
    CalcSum(itr, current_sum);
  }
}
/***** MAIN *****/
signed main() {
  int n = in();
  int q = in();
  
  REP(i,n) {
    nodes[i].value = 0;
    nodes[i].sum = 0;
  }
  REP(i,n-1) {
    int index = in();
    int num = in();
    nodes[index-1].next_index_set.insert(num-1);
  }
  REP(i,q) {
    int node_num = in();
    int sum = in();
    nodes[node_num-1].sum += sum;
  }
  CalcSum(0,0);
  REP(i,n) {
    cout << nodes[i].value;
    if(i < n-1) cout << " ";
    else cout << endl;
  }
  return 0;
}
/***** MAIN *****/
