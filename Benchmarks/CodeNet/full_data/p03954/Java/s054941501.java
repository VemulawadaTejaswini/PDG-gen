
#include <string>
#include <sstream>
#include <iostream>
#include <vector>
#include <math.h>
#include <algorithm>
#include <functional>
#include <map>
#include <climits>
#include <queue>

using namespace std;

#define ll long long
#define MOD 1000000007LL


class Main {
public:
	int topNum(vector<int>& as) {

		vector<int> oldVec = as;
		vector<int> newVec;
		for (int i = (as.size() + 1) / 2;i >= 2;i--) {
			newVec.clear();
			for (int j = 1;j <= oldVec.size() - 2;j++) {
				newVec.push_back(median3(oldVec[j - 1], oldVec[j], oldVec[j + 1]));
			}
			oldVec = newVec;
		}

		return newVec[0];
	}

	int median3(int x, int y, int z)
	{
		if (x < y) {
			if (y < z) {
				return y;
			}
			else if (z < x) {
				return x;
			}
			return z;
		}
		else {
			if (z < y) {
				return y;
			}
			else if (x < z) {
				return x;
			}
			return z;
		}
	}
};


int main()
{
	Main m;
	int n;
	vector<int> as;

	cin >> n;
	for (int i = 0;i < 2 * n - 1;i++) {
		int inp;
		cin >> inp;
		as.push_back(inp);
	}

	cout << m.topNum(as) << endl;

    return 0;
}

