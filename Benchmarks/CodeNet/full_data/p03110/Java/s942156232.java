#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
typedef pair<int, int> P;
#define rep(i, n) for (int i = 0; i < (int)(n); ++i)
template <class T> inline bool chmin(T &a, T b) {if (a > b){a = b;return true;}return false;}
template <class T> inline bool chmax(T &a, T b) {if (a < b){a = b;return true;}return false;}

int main(){
    cin.tie(0);
    ios::sync_with_stdio(false);
    std::cout<<std::fixed<<std::setprecision(10);
    int n; cin>>n;
    double ans=0;
    rep(i, n){
        double u; 
        string x;
        cin>>u;
        cin>>x;
        if(x=="JPY"){
            ans += u;
        } else {
            ans +=(u*380000.0);
        }
    }
    cout << ans <<endl;
}