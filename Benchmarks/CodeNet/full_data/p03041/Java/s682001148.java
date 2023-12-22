#include<iostream>
#include<string.h>
#include<math.h>

using namespace std;

int main() {
	int a, b;
	cin >> a >> b;
	string s;
	cin >> s;
	s[b - 1] -= 'A';
	s[b - 1] += 'a';
	cout << s << endl;
	return 0;
}