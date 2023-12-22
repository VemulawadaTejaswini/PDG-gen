#include<iostream>
#include<string>

using namespace std;

#define INF 1000000007
#define int long long
#define FOR(i, a, b) for (int i = (a); i < (b); i++)
#define rep(i, n) FOR(i, 0, n)
int gcd(int a, int b)
{
	return b ? gcd(b, a % b) : a;
}
int lcm(int a, int b) { return a / gcd(a, b) * b; }
signed main()
{
	string S;
	int K;
	cin >> S >> K;
	string G(S);
	int count_s = 0;
	int count_g = 1;
	for (int i = 1; i < S.length(); i++) {
		if (S[i] == S[i - 1]) {
			count_s++;
			S[i] = '0';
		}
	}
	for (int i = 2;i < G.length();i++) {
		if (G[i] == G[i-1]) {
			count_g++;
			G[i] = '0';
		}
	}
	if (S.length() == 1) {
		cout << count_s * ((K - 1) / 2 + 1) + count_g * K / 2 << endl;
		return 0;
	}
	if (S[0] != S[S.length()-1]) {
		cout << count_s * K <<endl; //SSSS...
	}
	else if(G[G.length()-1] == S[0]){
		cout << count_s + count_g * (K - 1) << endl; //SGGG...
	}
	else {
		cout << count_s * ((K-1)/2 + 1)  + count_g * K/2<< endl; //SGSGSGSG...
	}