#pragma GCC optimize("O3")

/****Author: Barish Namazov****/
#include <bits/stdc++.h>

using namespace std;

/***TEMPLATE***/
#define all(v) (v).begin(),(v).end()
#define rall(v) (v).rbegin(),(v).rend()

#define F first
#define S second
#define pb push_back

#define endl '\n'

const int max4 = 10004;
const int maxx = 100005;
const int max6 = 1000006;
const int lg5 = 17;

const int INF = 2 * 1000000007;
const long long INFLL = 4LL * 1000000000 * 1000000000;

/***************/

int powmod (int a, int b, int mod) {
    int res = 1; a %= mod;
    for (; b; b >>= 1) {
        if (b & 1) {
            res = 1LL * res * a % mod;
        }
        a = 1LL * a * a % mod;
    }
    return res;
}

int gcd (int a, int b) {
    while (b > 0) {
        int t = a % b;
        a = b, b = t;
    }
    return a;
}

int lcm (int a, int b) {
    return (a / gcd (a, b)) * b;
}

int is_prime (int n) {
    if (n <= 1 || n > 3 && (n % 2 == 0 || n % 3 == 0))
        return 0;
    for (int i = 5, t = 2; i * i <= n; i += t, t = 6 - t)
        if (n % i == 0)
            return 0;
    return 1;
}

/******Don't forget to use long long when needed!!******/

int F[maxx << 1];
void update(int i, int val) {
    for (; i < (maxx << 1); i |= i + 1) {
        F[i] += val;
    }
}
int getf(int i) {
    int res = 0;
    for (; i >= 0; i &= i + 1, i--) {
        res += F[i];
    }
    return res;
}

int n, arr[maxx], brr[maxx];
const int N = 100001;

long long get(int x) {
    vector <int> pref(n + 1, 0);
    for (int i = 1; i <= n; i++) {
        if (brr[i] < x) {
            arr[i] = -1;
        } else if (brr[i] == x) {
            arr[i] = 1;
        } else {
            arr[i] = 1;
        }
        pref[i] = pref[i - 1] + arr[i];
    }
    for (int i = 1; i <= n; i++) pref[i] += N;
    long long res = 0;
    update(N, 1);
    for (int i = 1; i <= n; i++) {
        res += getf(maxx * 2 - 1) - getf(pref[i]);
        update(pref[i], 1);
    }
    return res;
}

int main() {
    //freopen("262144.in","r",stdin);
    //freopen("262144.out","w",stdout);
    cin >> n;
    vector <int> v;
    for (int i = 1; i <= n; i++) {
        cin >> arr[i]; brr[i] = arr[i];
        v.pb(arr[i]);
    }/*
    int cnt = 0;
    for (int i = 1; i <= n; i++) {
        for (int j = i; j <= n; j++) {
            vector <int> p;
            for (int k = i; k <= j; k++) {
                p.pb(arr[k]);
            }
            sort(all(p));
            int md = p[p.size() / 2];
            if (md < 5) cnt++;
        }
    }
    cout << cnt << endl;
    cout << get(5) << " " << get(8) << endl;
    return 0;*/


    long long total = 1LL * n * (n + 1) / 2LL;
    int l = 0, r = v.size() - 1, best;
    while (r - l >= 0) {
        int mid = (l + r) >> 1, x = v[mid];
        long long t = get(x);
        if (t > total / 2 + 1) {
            r = mid - 1;
        } else {
            l = mid + 1, best = mid;
        }
        memset(F, 0, sizeof(F));
    }
    cout << v[best] << endl;
    return 0;
}
