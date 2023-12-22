/*
* @Author: dnhirapara
* @Date: 2020-04-30 22:24
* @Name: dp_g
*/
#include <bits/stdc++.h>\

using namespace std;

/************defination************/

#define endl "\n"
#define log(x) cerr << __LINE__ << ": " << #x << " -> " << (x) << endl;
#define ll long long int
#define ull unsigned long long int

void in_out_file(){
    #ifdef _DEBUG
        freopen("F:/Coding/CompetitiveProg/static/input.txt", "r", stdin);
        freopen("F:/Coding/CompetitiveProg/static/output.txt", "w", stdout);
        freopen("F:/Coding/CompetitiveProg/static/debug.txt", "w", stderr);
    #endif
}


//@time comp :
//@space comp :
int main(){
    // cin.ignore(); must be there when using getline(cin, s)
    #ifndef AUTO
        in_out_file();
    #endif
    ll n, m;
    cin>>n>>m;
    std::vector<ll> graph[n];
    ll vertax[n+1];
    for(ll i=0;i<=n;i++){
        vertax[i] = 0;
    }
    ll x, y;
    ll ans = 0;
    for(ll i=0;i<m;i++){
        cin>>x>>y;
        vertax[y] = max(vertax[x]+1,vertax[y]);
        if(ans < vertax[y]){
            ans = vertax[y];
        }
        // log(vertax[y])
    }
    cout<<ans<<endl;
    // for(ll i=0;i<n+1;i++){
    //     log(vertax[i])
    // }
    return 0;
}
