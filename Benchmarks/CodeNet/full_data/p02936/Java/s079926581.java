#include <bits/stdc++.h>
#define FOR(i,a,b) for(int i=(a);i<(b);++i)
#define REP(i,n)  FOR(i,0,n)
using namespace std;

vector<int> to[200005];
vector<int> ans;
void dfs(int v, int p = -1) {
    for(int u : to[v]) {
        if(u == p) continue;
        ans[u] += ans[v];
        dfs(u, v);
    }
}

int main() {
    int n, q;
    cin >> n >> q;
    REP(i, n - 1) {
        int a, b;
        cin >> a >> b;
        --a; -- b;
        to[a].push_back(b);
        to[b].push_back(a);
    }
    ans.resize(n);
    REP(i, q) {
        int p, x;
        cin >> p >> x;
        --p;
        ans[p] += x;
    }
    /*
    cout << "test" << endl;
    for (int u : to[0]) {
        cout << u << endl;
    }
    */
    dfs(0);
    REP(i, n) {
        cout << ans[i] << endl;
    }
    return 0;
}