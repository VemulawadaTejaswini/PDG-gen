#include <bits/stdc++.h>
using namespace std;
#define int long long
int MOD = (int)1e9 + 7;
int INF = (int)2e18;
// Comment out below and program paste

// #include "UnionFind.hpp"
// #include "power.hpp"

signed main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    int N;
    cin >> N;
    vector<int> A(N);
    int absMin = (int)1e9;
    int minusCount = 0;
    for (int i = 0; i < N; i++) {
        cin >> A[i];
        absMin = min(absMin, abs(A[i]));
        if (A[i] < 0) ++minusCount;
    }
    int answer = 0;
    for (int i = 0; i < N; i++) {
        answer += abs(A[i]);
    }
    if (minusCount % 2 == 1) answer -= absMin * 2;
    cout << answer << endl;
}
