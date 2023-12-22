#include <bits/stdc++.h>
#define lint long long
using namespace std;
 
int main()
{
    lint n;
    cin >> n;
    ll ans = 1e16;
    for(ll i = 1; i*i <= n; i++){
        if(n%i) continue;
        ans = min(ans, i+n/i-2);
    }
    cout << ans << endl;
 
    return 0;
}