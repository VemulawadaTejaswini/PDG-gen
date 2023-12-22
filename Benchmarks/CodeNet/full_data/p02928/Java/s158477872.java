#include <bits/stdc++.h>
using namespace std;

int main() {
  long N,K;
  cin >> N >> K;
  vector<long> vec(N);
  long X = 0;
  
  for(long i=0;i<N;i++){
   cin >> vec.at(i);
  }
  
  for(long i=0;i<N;i++){
    for(long T=0;T<N-i;T++){
      if( vec.at(i) > vec.at(i+T) ){
        X += K*(K+1)/2;
      }
    }
  }
  
  long V = X%1000000007;
  
  cout << V << endl;
  
}