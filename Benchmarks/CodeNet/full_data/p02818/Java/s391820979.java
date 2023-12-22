#include<bits/stdc++.h>
using namespace std;

int main(){
  long long A,B,K;
  cin >> A >> B >> K;
  long long taka,aoki;
  taka=A-K;
  aoki=B;
  if(taka<0){
    aoki+=taka;
    if(aoki<0){
      aoki=0;
    }
    taka=0;
  }
  cout << taka << " " << aoki << endl;
}