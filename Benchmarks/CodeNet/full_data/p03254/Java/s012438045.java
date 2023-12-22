#include<bits/stdc++.h>
using namespace std;

int main (){
  int N, x;
  int p = 1, sigma = 0;
  cin >> N >> x;
  vector<int> vec(N);
  for (int i=0; i < N;i++){
    cin >> vec.at(i);
    sigma += vec.at(i);
  }
  for (int i = 0; i < N; i++){
    for (int j = i + 1; j < N; j++){
      int t;
      if (vec.at(i) > vec.at(j)){
        t = vec.at(i);
        vec.at(i) = vec.at(j);
          vec.at(j) = t;
      }
    }
  }

  int sum = vec.at(0);
  if(sum > x){
    p =0;
  }

  int i = 1;
  while (i < N  && sum + vec.at(i) <= x){
    p++;
    sum += vec.at(i);
    i++;
  }
  if(sigma < x){
  p--;
  }
  cout << p << endl;
}    