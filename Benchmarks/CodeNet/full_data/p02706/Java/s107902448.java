#include <bits/stdc++.h>
using namespace std;
#define all(v) ((v).begin()),((v).end())
#define ll long long
#define fastIO cout << fixed << setprecision(12), ios::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr)
double const EPS = 1e-9, PI = acos(-1);
const int N = 1e6 + 9, OO = 1e9 + 7, MOD = 1e9 + 7;
const ll INF = 1e18;
using namespace std;

int main() {
	fastIO;
#ifdef LOCAL
//	freopen("input.in", "rt", stdin);
#endif
	int n, m;
	cin >> n >> m;
	ll total = 0, a;
	for (int i = 0; i < m; ++i) {
		cin >> a;
		total += a;
	}
	if(total > n) {
		cout << -1;
	} else {
		cout << n - total;
	}
	return 0;
}
