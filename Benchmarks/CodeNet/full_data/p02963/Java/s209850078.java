#include <bits/stdc++.h>
using namespace std;

int main() {
  int64_t pivot = 1000000000;
  int64_t S;
  cin >> S;
  int64_t x1, y1, x2, y2, x3, y3;
  x1 = 0;
  y1 = 0;
  x3 = pivot;
  y3 = 1;
  
  int64_t r = S % pivot;
  int64_t q = (S-r)/pivot;
  x2 = pivot - r;
  y2 = q + 1;
  cout << x1 << " " << y1 << " " << x2 << " " << y2 << " " << x3 << " " << y3 << endl;
}