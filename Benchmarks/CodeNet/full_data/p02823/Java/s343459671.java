#include <bits/stdc++.h>
using namespace std;

typedef long long ll;
#define rep(i,x) for(int i=0;i<x;i++)
#define put(ans)    cout << ans << endl;

int main(){
    ll a,b,n;
    cin >> n >> a >> b;

    if((b-a)%2==0)
        cout << (b-a)/2 << endl;
    else
        cout << min(a-1,n-b)+1+(b-a-1)/2 << endl;

    return 0;
}
