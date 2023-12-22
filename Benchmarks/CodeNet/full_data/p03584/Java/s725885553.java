#include<algorithm>
#include<iostream>
#include<vector>
using namespace std;
typedef long long lint;
typedef vector<int>vi;
typedef pair<int,int>pii;
#define rep(i,n)for(int i=0;i<(int)(n);++i)

int main(){
  int n;
  lint k;
  cin>>n>>k;
  vector<lint>a(n),b(n);
  rep(i,n){
    cin>>a[i]>>b[i];
  }
  lint m=0;
  while(1){
    lint sum=0;
    rep(i,n)
      if((a[i]&k)==a[i])sum+=b[i];
    m=max(m,sum);
    if(k==0)break;
    k+=1;
    k&=k-1;
    k=max(k-1,0LL);
  }
  cout<<m<<endl;
}
