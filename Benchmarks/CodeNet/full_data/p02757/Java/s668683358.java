#define _LIBCPP_DEBUG 0
#include<bits/stdc++.h>
using namespace std;
typedef long long int ll;
ll MOD = 1e9 + 7;
int INF=1<<30;


int main(void) {

    int N,P; cin>>N>>P;
    string S; cin>>S;
    ll ans = 0;
    if(P==2 || P==5){
        for (int i = 0; i < N; ++i) {
            if((S[i]-'0')%P==0)ans += i+1;
        }
    }else{
        map<int, int> mp;
        mp[0]=1;
        reverse(S.begin(), S.end());
        int sum = 0;
        int base = 1;
        for (int i = 0; i < N; ++i) {
            sum += (S[i]-'0') * base;
            sum %= P;
            ans += mp[sum];
            mp[sum]++;
            base *= 10;
            base %= P;
        }
    }

    cout<<ans<<endl;

    return 0;
}