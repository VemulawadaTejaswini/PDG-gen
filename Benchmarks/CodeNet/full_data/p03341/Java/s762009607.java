#include<bits/stdc++.h>
#define ALL(c) (c).begin(),(c).end()
#define EACH(i,c) for(auto i=(c).begin();i!=(c).end();++i)
using namespace std;

int main(){
	int N;
	string S;
	cin >> N >> S;

	vector<int> e(N), w(N), re(N), rw(N);
	for(int i = 1; i < N; ++i) {
		e[i] = e[i-1] + (S[i-1] == 'E' ? 1: 0);
		w[i] = w[i-1] + (S[i-1] == 'W' ? 1: 0);
	}
	for(int i = N-2; i >= 0; --i) {
		re[i] = re[i+1] + (S[i+1] == 'E' ? 1: 0);
		rw[i] = rw[i+1] + (S[i+1] == 'W' ? 1: 0);
	}

	int res = N;
	for(int i = 0; i < N; ++i) {
		res = min(res, w[i] + re[i]);
	}

	cout << res << endl;
	return 0;
}
