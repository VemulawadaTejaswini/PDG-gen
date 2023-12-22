#include<iostream>
#include <cstdio>
#include <cstdlib>
#include <cmath>
#include <string>
#include <algorithm>
#include <vector>
#include <set>
#include <map>
#include <list>
    using namespace std;

typedef long long ll;

#define MOD 1000000007
#define p(x) cout << x << endl;
#define el cout << endl;
#define rep(i, n) for (int i = 0; i < (int)(n); i++)

int main()
{
    cin.tie(0);
    ios::sync_with_stdio(false);

    int x, y;
    cin >> x >> y;

    int num[] = {0, 1, 3, 1, 2, 1, 2, 1, 1, 2, 1, 2, 1};
    if(num[x] == num[y]) p("Yes")
    else p("No");
}