#include <iostream>
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
typedef vector<int> vi;
typedef vector<ll> vll;

#define rep(i, n) for (int i = 0; i < (int)(n); i++)
#define p(x) cout << x << endl;
#define all(v) (v).begin(), (v).end()

#define MOD 1000000007
#define PI acos(-1)

int main(){
    cin.tie(0);
    ios::sync_with_stdio(false);

    string s;
    cin >> s;

    int len = s.size();

    if(len == 0 || len == 1) {
        cout << 0 << endl;
        return 0;
    }

    int cnt0 = 0;
    int cnt1 = 0;

    for(int i = 0; i < len; i++){
        if(s[i] == '0'){
            cnt0++;
        }else{
            cnt1++;
        }
    }

    int num = abs(cnt0 - cnt1);

    cout << len - num << endl;

}