#include <bits/stdc++.h>

using namespace std;
using int64 = long long;

constexpr int DEBUG = 0;

template<typename T>
vector<vector<T>> MakeVector2D(int d1, int d2, T default_value) {
  return vector<vector<T>>(d1, vector<T>(d2, default_value));
}

template<class T> inline bool UpdateMin(T& a, T b) {
  if (a > b) { a = b; return 1; } return 0;
}

template<class T> inline bool UpdateMax(T& a, T b) {
  if (a < b) { a = b; return 1; } return 0;
}

int main() {
  ios::sync_with_stdio(false);
  cin.tie(0);

  int n, k;
  vector<int> scores(3);
  cin >> n >> k >> scores[0] >> scores[1] >> scores[2];

  string t;
  cin >> t;
  vector<int> xs(n);
  for (int i = 0; i < n; i++) {
    if (t[i] == 'r') {
      xs[i] = 2;
    } else if (t[i] == 's') {
      xs[i] = 0;
    } else {
      xs[i] = 1;
    }
  }

  vector<vector<int>> mod_xs(k);
  for (int i = 0; i < n; i++) {
    mod_xs[i % k].push_back(xs[i]);
  }

  int ans = 0;
  for (int mod = 0; mod < k; mod++) {
    const vector<int>& ys = mod_xs[mod];
    int m = ys.size();
    vector<vector<int>> dp = MakeVector2D(m + 1, 3, 0);
    for (int i = 0; i < m; i++) {
      for (int j1 = 0; j1 < 3; j1++) {
        for (int j2 = 0; j2 < 3; j2++) {
          if (j1 == j2) continue;
          int d = 0;
          if (j2 == ys[i]) d = scores[j2];
          UpdateMax(dp[i + 1][j2], dp[i][j1] + d);
        }
      }
    }
    ans += max(dp[m][0], max(dp[m][1], dp[m][2]));
  }

  cout << ans << endl;
}
