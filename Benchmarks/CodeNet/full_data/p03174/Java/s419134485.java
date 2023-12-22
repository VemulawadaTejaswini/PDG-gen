#include<bits/stdc++.h>
using namespace std;
typedef long long ll;
ll mod=1000000007;
ll dp[1<<21];
int main()
{
    ll n;
    cin>>n;
    ll a[n][n];
    for(ll i=0;i<n;i++)
        for(ll j=0;j<n;j++)
            cin>>a[i][j];
    ll mx=1<<n;

    for(ll i=0;i<mx;i++)
        dp[i]=0;
    dp[0]=1;
    for(ll i=0;i<n;i++)
    {
        for(ll j=mx-1;j>=0;j--)
        {
            if(__builtin_popcount(j)!=(i+1))
                dp[j]=0;
            else
            {
                dp[j]=0;
                for(ll k=0;k<n;k++)
                    if((j&(1<<k))&&(a[i][k]))
                        dp[j]=(dp[j]+dp[j^(1<<k)])%mod;
            }
        }
    }
    cout<<dp[mx-1]<<endl;
    return 0;
}
