#include <iostream>
#include <algorithm>
#include <vector>
#include <regex>
#define pb push_back
using namespace std;

int main() {
	int a, b;
	int summ=0;
	cin >> a >> b;
	long long c[1000000];
	for (int i = 0; i < a; i++)
	{
		cin >> c[i];
	}
	sort(c,c+10000000);
	if (b > a) {
		cout << 0;
	}
	else {
		for (int i = 0; i < a-b; i++)
		{
			summ = summ + c[i];
		}
		cout << summ;
	}
	return 0;
}