#include<bits/stdc++.h>
using namespace std;
typedef long long ll;
const int N=1e5+10,mod=1e9+7;
char s[N];
int a[N];
ll k;
ll f(ll k)
{
    if(k==0) return 0;
    if(k==1) return 1;
    if(k%2) return (2*f(k/2)+f(k/2+1))%mod;
    return 3*f(k/2)%mod;
}
int main()
{
    scanf("%s",s+1);
    int len=strlen(s+1);
    for(int i=1;i<=len;i++)
    {
        if(s[i]=='1')
            k=(k*2+1)%mod;
        else k=k*2%mod;
    }
    k=(k+1)%mod;
    printf("%lld\n",f(k));
}
