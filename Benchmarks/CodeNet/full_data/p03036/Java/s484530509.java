#include <bits/stdc++.h>
using namespace std;

int main(){
  int r,d,x;
  cin >> r >> d >> x;
  int i;
  for(i=0;i<10;i++){
    x = r*x-d;
    cout << x;
  }
}
