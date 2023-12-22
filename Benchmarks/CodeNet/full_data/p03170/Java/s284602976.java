#include <bits/stdc++.h>
#define IO ios_base::sync_with_stdio(0); cin.tie(0); cout.tie(0)
#define EPS 1e-9
#define f first
#define s second
#define ll long long
#define read(x) scanf("%d", &x)
#define all(v) v.begin(), v.end()
using namespace std;
int n, K;
vector<int> v;
int dp[100005];
int solve(int k){
    if(k > K)
        return 0;
    if(k == K)
        return 1;
    if(dp[k] != -1)
        return dp[k];
    for(int &a : v){
        if(solve(k + a))
            return dp[k] = 0;
    }
    return dp[k] = 1;
}
int main(){
    //freopen("test.txt", "r", stdin);
    cin >> n >> K;
    v.resize(n);
    for(int &a : v)
        cin >> a;
    memset(dp, -1, sizeof(dp));
    cout << (solve(0) ? "Second" : "First");
}