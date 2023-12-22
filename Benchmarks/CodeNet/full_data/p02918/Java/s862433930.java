#include <bits/stdc++.h>
 
using namespace std;
 
typedef long long ll;
typedef long double ld;
typedef pair < int , pair < int , int > > mp;

#define rep(i , j , n) for(long long i = j ; i <= n ; i++)
#define per(i , j , n) for(long long i = j ; i >= n ; i--)
 
const ll N = 123456;
const ll mod = 1e9 + 7;
const ld eps = 1e-6;
const ld pi = 3.1415926535;

int a[N];
int vis[N];
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
 
    cout << fixed << setprecision(12);

    int n;

    int k;

    cin >> n >> k;

    string s;
    cin >> s;

    rep(i , 1 , n) {
      if(s[i - 1] == 'L') {
        a[i] = 1;
      }
      else {
        a[i] = -1;
      }
    }

    // rep(i , 1 , n) {
    //   a[i] += a[i - 1];
    // }

    // rep(i , 1 , n) {
    //   cout << a[i] << " ";
    // }

    // cout << endl;

    int sum = 0;

    int cur = 1;
    if(n == 1) {
      cout << 0 << endl;
      return 0;
    }

    vector < int > res;

    // rep(i , 1 , n) {
    //     cout << a[i] << endl;
    // }
    rep(i , 2 , n) {
        if(a[i] == a[i - 1]) {
            //cout << a[i - 1] << " " << a[i] << endl;
            cur++;
        }
        else {
            res.push_back(cur);
            cur = 1;
        }
    }

    res.push_back(cur);

    for(auto j : res) {
        sum += j - 1;
    }

    while(k--) {
        sum += 2;
    }
    cout << min(sum , n - 1) << endl;
    return 0;

}
