// AtCoder.cpp : コンソール アプリケーションのエントリ ポイントを定義します。
//

#include "stdafx.h"
#include <iostream>
#include <cstdio>
#include <cstring>
#include <cstdlib>
#include <algorithm>
#include <string>
#include <sstream>
#include <complex>
#include <vector>
#include <list>
#include <queue>
#include <deque>
#include <stack>
#include <map>
#include <set>
#include <fstream>
using namespace std;
typedef long long unsigned int ll;

#define REP(i,n)for(i=0;i<n;i++)

#define INF (1e9)
#define PI  (acos(-1))

int a, b;

int main()
{


	while (cin >> a >> b) {
		if (a > b) {
			cout << a - 1 << endl;
		}
		else {
			cout << a << endl;
		}
	}

    return 0;
}

