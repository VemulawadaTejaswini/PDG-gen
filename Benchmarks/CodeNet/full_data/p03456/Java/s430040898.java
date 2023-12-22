#include <bits/stdc++.h>
using namespace std;

int main() {
  string a,b;
  cin >> a >> b;
  string ans="No";
  int num=stoi(a+b);
  for(int i=1;i<=10000;i++){
    if(i*i==num){
      ans="Yes";
      break;
    }
  }
  cout << ans <<endl;
  return 0;
}
