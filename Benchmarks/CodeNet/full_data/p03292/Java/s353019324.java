#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
    int c,a[3],n,b=0,i,j;
    //scanf("%d%d%d",&a,&b,&c);
    for(i=0;i<3;i++)
    {
        cin>>a[i];
    }
    sort(a,a+3);
    for(i=0;i<2;i++)
    {
        b=b+abs(a[i]-a[i+1]);
    }
    cout<<b<<"\n";
    return 0;
}
