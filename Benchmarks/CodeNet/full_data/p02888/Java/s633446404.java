#include <bits/stdc++.h>
using namespace std;
int n,k,ng=0,ok=1234,l[2020],a[2020020],A=0,b[2020020];
int main(){
	cin>>n;
	for(int i=0;i<n;i++)cin>>l[i];
	sort(l,l+1);
	for(int i=0;i<n;i++){
		for(int j=(i-1);j<n;j++){
			a[A]=(i+j);
			A++;
		}
	}
	for(int i=0;i<=A;i++){
		while((ok-ng)!=1){
			int m=(ng+ok)/2;
			if(m<a[i])ng=m;
			else ok=m;
		}
		b[i]=ok;
		cout<<b[i]<<" ";
	}
}
