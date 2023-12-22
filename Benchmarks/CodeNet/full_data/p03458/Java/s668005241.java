#include <iostream>
#include <vector>
#include <string.h>
#include <stack>
#include <queue>
#include <algorithm>
#include <climits>
#include <cmath>
#include <map>
#include <set>
#include <assert.h>
#include <stdio.h>
#define REP(i,n) for(ll i=0;i<(n);i++)
#define MOD 1000000007
//#define int long long
#ifdef int
const long long INF = LLONG_MAX / 10;
#else
const int INF = 1010101010;
#endif
using namespace std;
typedef long long ll;
typedef vector<vector<ll> > mat;
typedef pair<int, int> P;
//typedef pair<double, double> P;
const int dx[9] = {-1, 0, 0, 1, -1, -1, 1, 1, 0};
const int dy[9] = {0, -1, 1, 0, -1, 1, -1, 1, 0};
 
int N, K;
int grid[2020][2020]; //[x][y]
int sum[2020][2020];

int calc_sub(int x, int y) {
  if (x+K-1<0 || y+K-1<0) return 0;
  int lx = max(0, x);
  int rx = min(2 * K - 1, x + K - 1);
  int by = max(0, y);
  int ty = min(2 * K - 1, y + K - 1);

  int ret = sum[rx][ty];
  if (0 < lx) ret -= sum[lx - 1][ty];
  if (0 < by) ret -= sum[rx][by - 1];
  if (0 < lx && 0 < by) ret += sum[lx - 1][by - 1];

  return ret;
}

int calc(int x, int y)
{
  // cout << "calc(" << x << "," << y << ")" << endl;
  int sum = 0;
  for (int xx=x-2*K, ix=0; xx<=x; xx+=K, ix++) {
    for (int yy=y-2*K, iy=0; yy<=y; yy+=K, iy++) {
      if ((ix + iy) % 2 == 0) {
        sum += calc_sub(xx, yy);
      }
    }
  }
  // if (sum == 6) {
  //   printf("x = %d, y = %d\n", x, y);
  // }
  return sum;
}
 
signed main()
{
  cin >> N >> K;
  REP(i,N) {
    int x, y;
    char c;
    cin >> x >> y >> c;
    if (c == 'W') x += K;
    grid[x % (2 * K)][y % (2 * K)]++;
  }

  // cout << "!!!!!!!!!!!!!!" << endl; 

  //2次元累積和の前計算
  for (int y=0; y<2*K; y++) {
    int subsum = 0;
    for (int x=0; x<2*K; x++) {
      if (y == 0) {
        subsum += grid[x][y];
        sum[x][y] = subsum;
      } else {
        subsum += grid[x][y];
        sum[x][y] = subsum + sum[x][y-1];
      }
    }
  }

  // cout << "222222222222222" << endl;

  int ans = 0;
  REP(y,2*K) {
    REP(x,2*K) {
      ans = max(ans, calc(x, y));
    }
  }

  cout << ans << endl;

  // for (int y=2*K-1; y>=0; y--) {
  //   REP(x,2*K) {
  //     cout << sum[x][y] << " ";
  //   }
  //   cout << endl;
  // }
}