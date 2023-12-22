#include <string>
#include <cmath>
#include <cstdio>
#include <vector>
#include <algorithm>
#include <iostream>
#include <queue>
#include <tuple>
#include <functional>
#include <set>

using namespace std;

string s;
string t;

int main()
{
	cin >> s;
	cin >> t;

	bool f = false;
	string ans = "";
	for (int i = 0; i < s.length(); ++i) {
		bool g = true;
		for (int j = 0; j < t.length(); ++j) {
			if (i + j >= s.length()) {
				g = false;
			}
			g = g && (s[i + j] == '?' || s[i + j] == t[j]);
		}
		if (g) {
			string c = s;
			for (int j = 0; j < s.length(); ++j) {
				if (c[j] == '?')
					c[j] = 'a';
			}
			for (int j = 0; j < t.length(); ++j) {
				c[i + j] = t[j];
			}
			if (ans == "" || ans > c) {
				ans = c;
			}
		}
	}
	if (ans == "")
	{
		cout << "UNRESTORABLE" << endl;
	}
	else {
		cout << ans << endl;
	}
}