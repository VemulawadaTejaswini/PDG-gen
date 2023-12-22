//#define _USE_MATH_DEFINES
#include <iostream>
#include <cstdio>
#include <cstdlib>
#include <cstring>
#include <algorithm>
#include <cmath>
#include <vector>
using namespace std;
int i = 0;

bool is_kaibun(char s[], int l, int r) {
	while(s[l] == s[r]) {
		l++;
		r--;
		i++;
	}
	if (l > r) return true;
	else return false;
}

int main(){
    char s[100];
	cin >> s;
	int n = strlen(s);
	bool flag = true;
	if (!is_kaibun(s, 1 - 1, n - 1)) {flag = false;}
	if (!is_kaibun(s, 1 - 1, (n - 1) / 2 - 1)) {flag = false;}
	if (!is_kaibun(s, (n + 3) / 2 - 1, n - 1)) {flag = false;}
	if (flag) cout << "Yes" << endl;
	else cout << "No" << endl;
	return 0;
}