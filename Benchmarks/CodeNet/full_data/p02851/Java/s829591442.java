//Compete against Yourself.
#include <bits/stdc++.h>
#define _ ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
#define int long long
#define pb push_back
#define sz(i) (int)(i.size())
#define F first
#define S second
#define L long double
#define P pair<int, int>
const int inf = 0x3f3f3f3f3f3f3f3LL;
const int mod = (int)1e9 + 7;
using namespace std;
#if LOCAL
#include "../../tr.h"
#else
#define tr(...)
#define endl '\n'
#endif
template<class T> void smin(T& a, T val) {if (a > val) a = val;}template<class T> void smax(T& a, T val) {if (a < val) a = val;}
const int N = 5*(int)1e5 + 10;

int n, a[N], k;
int32_t main(){_

   cin>>n>>k;

   map<int, int> M;
   M[0]++;

   vector<int> pref;
   pref.push_back(0);
   for (int i = 1; i <= n; ++i)
   {
      cin>>a[i];
      pref.push_back(pref.back() + a[i]);
   }

   int sum = 0, ans = 0;
   for (int i = 1; i <= n; ++i)
   {
      sum = pref[i];
      int tt = (sum - i) % k;
      tt += k;
      tt %= k;
      ans += M[tt];
      M[tt]++;
      if(i-k+1 >= 0){
         int yy = pref[i-k+1] - (i-k+1);
         yy %= k;
         yy += k; 
         yy %= k;
         M[yy]--;
      }
   }
   
   cout<<ans;

   return 0;
}