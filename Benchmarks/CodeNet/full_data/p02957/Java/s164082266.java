#include<bits/stdc++.h>
#define pi acos(-1.0)
using namespace std;

const int maxn = 3010;
double mina[maxn], maxa[maxn];

double deg2rad(double deg) { return deg * pi * 180; }

int main() {
  #ifdef LOCAL
  freopen("in", "r", stdin);
  freopen("out", "w", stdout);
  #endif

  ios::sync_with_stdio(false);
  int a, b;
  cin >> a >> b;
  if ((a + b) & 1) cout << "IMPOSSIBLE\n"
  else cout << (a + b) / 2;
  return 0;
}