#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;
    vector<pair<long double,string>> p(n);
    for(int i = 0; i < n; i++){
        double a;
        string b;
        cin >> a >> b;
        p.at(i) = make_pair(a,b);
    }
    double sum = 0;
    for(int i = 0; i < n; i++){
        if(p.at(i).second == "JPY"){
            sum = sum + p.at(i).first;
        } else {
            sum = sum + p.at(i).first * 380000;
        }
    }
    cout << fixed << setprecision(12) << sum;
}