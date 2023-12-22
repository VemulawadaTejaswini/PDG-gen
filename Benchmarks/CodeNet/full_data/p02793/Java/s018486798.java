//****** @mdazmat9 **********
#include<bits/stdc++.h>
using namespace std;
#define int long long
#define UB upper_bound
#define LB lower_bound
#define BS binary_search
#define EB emplace_back
#define endl "\n"
#define MOD 1000000007
#define F first
#define S second
#define ALL(a) (a).begin(),(a).end()
#define IOS ios::sync_with_stdio(0); cin.tie(0); cout.tie(0)
int fast_pow(int x, int y, int p);

void solve() {
    int n;cin>>n;
    int a[n];
    int lcm=1;
    for(int i=0;i<n;i++){
        cin>>a[i];
        int gc=__gcd(lcm,a[i]);
        gc=(lcm*a[i])/gc;
        lcm=gc;
    }
   int ans=0;
    for(int i=0;i<n;i++){
        int num=lcm/a[i];
        ans+=num;
        ans%=MOD;
    }
    cout<<ans<<endl;

}
int32_t main() {
    IOS;
    int test = 1;
    //cin >> test;
    while (test--) {
        solve();
    }
    return 0;
}
int fast_pow(int x, int y, int p) {
    int res = 1;
    x = x % p;
    while (y > 0) {
        if (y & 1)
            res = (res * x) % p;
        y = y >> 1;
        x = (x * x) % p;
    }
    return res;
}