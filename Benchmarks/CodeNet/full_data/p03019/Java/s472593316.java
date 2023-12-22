#include "bits/stdc++.h"
using namespace std;
int N, X;
long long l[300010], r[300010], b[300010];

bool good(long long need) {
	long long extra = need % X;
	need /= X;
	if(need >= N) return true;

	long long sum = 0;
	vector <pair <long long, int>> v;
	for(int i = 1; i <= N; i++) {
		sum -= l[i] * b[i];
		v.emplace_back(r[i] * (X - b[i]) + l[i] * b[i], i);
	}
	sort(v.begin(), v.end());
	reverse(v.begin(), v.end());
	for(int i = 0; i < need; i++) {
		sum += v[i].first;
	}
	if(extra == 0) return sum >= 0;
	long long ans = sum;
	for(int i = need; i < N; i++) {
		int id = v[i].second;
		long long diff = extra - b[id];
		ans = max(ans, sum + l[id] * diff + l[id] * b[id]);
		ans = max(ans, sum + r[id] * diff + l[id] * b[id]);
	}
	sum += v[need].first;
	for(int i = 0; i < need; i++) {
		int id = v[i].second;
		long long diff = extra - b[id];
		ans = max(ans, sum - r[id] * (X - b[id]) + l[id] * diff);
		ans = max(ans, sum - r[id] * (X - b[id]) + r[id] * diff);
	}
	return ans >= 0;
}

long long search(long long b, long long e) {
	if(b == e) {
		return b;
	}
	long long mid = (b + e) >> 1;
	if(good(mid)) {
		return search(b, mid);
	} else {
		return search(mid + 1, e);
	}
}

int main(int argc, char const *argv[])
{
	scanf("%d %d", &N, &X);
	for(int i = 1; i <= N; i++) {
		scanf("%lld %lld %lld", &b[i], &l[i], &r[i]);
	}
	printf("%lld\n", search(0, 1LL * X * N));
	return 0;
}