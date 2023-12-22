#include <algorithm>
#include <cmath>
#include <iomanip>
#include <iostream>
#include <string>
typedef long long ll;
using namespace std;

int main(void) {
  cout << fixed << setprecision(12);
  ll n, k;
  cin >> n >> k;
  ll ans = k;
  for(int i = 0; i < n - 1; i++) {
    ans *= k - 1;
  }

  cout << ans << endl;

  return 0;
}
