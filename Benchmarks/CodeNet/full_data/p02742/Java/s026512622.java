#include <bits/stdc++.h>
#define rep(i,n) for (int i = 0; i < (n); ++i)
using namespace std;
typedef long long  ll;

#define vi vector<int>
#define vl vector<ll>
#define vvi vector<vector<int>>
#define vvl vector<vector<ll>>
// constexpr ll mod = 1e9 + 7;

int main(){
    ll H, W;
    cin >> H >> W;
    ll ans = H*(W/2) + (W%2)*((H+1)/2);

    if(H==1 || W==1) {
        cout << 1 << endl;
        return 0;
    }

    cout << ans << endl;


    return 0;
}
