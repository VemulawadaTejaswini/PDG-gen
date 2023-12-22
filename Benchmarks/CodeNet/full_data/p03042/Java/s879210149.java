#include <bits/stdc++.h>
#define rep(i, n) for (int i = 0; i < (n); ++i)
using namespace std;
using ll = long long;
using P = pair<int, bool>;
const int INF = 1000000007;

int main() {
  int s;
  cin >> s;
  int a = s / 100;
  int b = s % 100;
  if ((a > 12 && b > 12) || (a == 0 && b > 12) || (a > 12 && b == 0) ||
      (a == 0 && b == 0))
    cout << "NA" << endl;
  else if (a <= 12 && b <= 12 && a != 0 && b != 0)
    cout << "AMBIGUOUS" << endl;
  else if (a > 12 || a == 0)
    cout << "YYMM" << endl;
  else
    cout << "MMYY" << endl;
}