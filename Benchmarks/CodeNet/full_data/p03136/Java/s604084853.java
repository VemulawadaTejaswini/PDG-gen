#include<iostream>
using namespace std; // 575

const int MAX = 10;
int main() {
	int N, L;
	cin >> N >> L;
	int big = L, sum = L;
	for (int i = 1;i < N;++ i) {
		cin >> L;
		big = max(big, L);
		sum += L;
	}
	cout << (big * 2 < sum ? "Yes" : "No");
	return 0;
}
/*
31536000のコメント解説欄
ここテンプレで用意してるから、A問題とかだとこの先空欄の危険あり
また、コンテスト後に https://31536000.hatenablog.com/ で解説していると思うので、良かったら読んでねー

なんで問題文中に解き方書いてんのこれ
*/