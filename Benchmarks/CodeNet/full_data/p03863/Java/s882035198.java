#include<iostream>
#include <math.h>
#include <bits/stdc++.h>
#define ll long long
#define inf 0x3f3f3f3f
#define maxn 310000
using namespace std;
int vis[maxn];
char s[111111];
int main()
{
    int i,j,n,jj=0,sum=0,k,flag;
    cin>>s;
    n=strlen(s);
    for(i=1;i<n-1;i++)
    {
        if(s[i-1]!=s[i+1]) jj++;
    }
    printf("%s\n",jj%2?"First":"Second");
    return 0;
}
