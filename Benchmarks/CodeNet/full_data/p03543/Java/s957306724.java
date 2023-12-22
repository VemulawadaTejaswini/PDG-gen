#include <iostream>
#include <vector>
#include <string>
#include <cstdio>
#include <cmath>
#include <algorithm>
using namespace std;

#define vi vector<int>
#define p pair<int, int>
#define REP(i, n) for(int i = 0;i < n; i++)
#define FOR(i, m, n) for(int i = m;i < n; i++)
#define YES cout << "YES" << endl;
#define NO cout << "NO" << endl;
#define Yes cout << "Yes" << endl;
#define No cout << "No" << endl;
#define BR cout << endl;
#define INF  2000000000

int a[6], sum = 0;

int main(){
    char a, b, c, d;
    cin >> a >> b >> c >> d;
    if((a == b && b == c) || b == c && c == d){
        Yes
    }else{
        No
    }
    return 0;
}
