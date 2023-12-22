//( ͡° ͜ʖ ͡°) °º¤ø,¸¸,ø¤º°`°º¤ø,¸,ø¤°º¤ø,¸¸,ø¤º°`°º¤ø,¸,ø¤º°` looking at my code...

#define ONLINE_JUDGE //in case i forget to uncomment this, sometimes the grader defines the macro ^.^
#ifdef ONLINE_JUDGE
#include <bits/stdc++.h>
#else
#include "stdc++.h"
#endif
#define MAX(x, y) (((x) > (y)) ? (x) : (y))
#define MIN(x, y) (((x) < (y)) ? (x) : (y))
#define INF  (int)1e9

#define int long long
using namespace std;

signed main() {
#ifndef ONLINE_JUDGE
    freopen("/Users/kdkdk/Desktop/input.txt", "r", stdin);
    //freopen("/Users/kdkdk/Desktop/output.txt", "w", stdout);
#endif
    
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    
    int k; cin >> k;
    
    int low = (k/50);
    vector<int> arr(50,49+low);
    cout << 50 << endl;
    for(int i = 0; i < 50; ++i) {
        if(i < k % 50) arr[i] = arr[i] + 50 - (k % 50)+1;
        cout << arr[i] << " ";
    }
    
    
    return 0;
}




