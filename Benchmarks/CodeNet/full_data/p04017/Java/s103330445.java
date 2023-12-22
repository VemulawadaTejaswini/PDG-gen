#define _CRT_SECURE_NO_WARNINGS
#include<sstream>
#include<iostream>
#include<cstdio>
#include<cstdlib>
#include<cstring>
#include<climits>
#include<cmath>
#include<string>
#include<vector>
#include<set>
#include<map>
#include<queue>
#include<numeric>
#include<functional>
#include<algorithm>
#include<bitset>
#include<tuple>
#include<unordered_set>
#include<random>
using namespace std;
#define INF (1<<29)
#define rep(i,n) for(int i=0;i<(int)(n);i++)
#define all(v) v.begin(),v.end()
#define uniq(v) v.erase(unique(all(v)),v.end())
 
 
 
 
vector<tuple<int, int, int>> s[2][100000];
int N;
int x[100000];
int L, Q;
int ans[100000];
int dist[100000];
 
int bs;
 
 
void solve(int dir) {
	rep(i, N - 1) {
		int nxt = upper_bound(x, x + N, x[i] + L) - 1 - x;
		if(s[dir][i].size() != 3){ return; }
		if (s[dir][i].size() < bs) {
			for (const auto &t : s[dir][i]) {
				int b, j, cost;
				tie(b, j, cost) = t;
				if (nxt >= b) {
					ans[j] = cost + 1;
				}
				else {
					s[dir][nxt].emplace_back(b, j, cost + 1);
				}
			}
		}
		else {
			int c = 1, d = 0;
			dist[i] = 0;
			for (int j = i + 1; j < N; j++) {
				d += x[j] - x[j - 1];
				if (d > L) {
					d = x[j] - x[j - 1];
					c++;
				}
				dist[j] = c;
			}
			for (const auto &t : s[dir][i]) {
				int b, j, cost;
				tie(b, j, cost) = t;
				ans[j] = cost + dist[b];
			}
		}
		{
			vector<tuple<int, int, int>> a;
			s[dir][i].swap(a);
		}
	}
}
 
 
 
 
 
int main() {
	ios::sync_with_stdio(0);
	cin.tie(0);
	cin >> N;
	rep(i, N)cin >> x[i];
	cin >> L >> Q;
	bs = sqrt(Q);
	rep(i, Q) {
		int a, b;
		cin >> a >> b;
		a--; b--;
		if (a < b) {
			s[0][a].emplace_back(b, i, 0);
		}
		else {
			a = N - a - 1;
			b = N - b - 1;
			s[1][a].emplace_back(b, i, 0);
		}
	}
	solve(0);
	reverse(x, x + N);
	rep(i, N)x[i] *= -1;
	solve(1);
	rep(i, Q)cout << ans[i] << endl;
 
	return 0;
}