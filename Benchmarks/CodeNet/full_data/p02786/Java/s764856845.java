#include <bits/stdc++.h>
using namespace std;

int main(){
  long h;
  cin >> h;
  vector<long> H(0);
  H.push_back(h);
  long no = 0;
  long total = 0;
  long s;
  while(true){
    for(int i=0;i<H.size();i++){
      cout << H[i];
    }
    cout << endl;
    sort(H.begin(), H.end());
    no = 0;
    cout << endl;
    for(int i=0;i<H.size();i++){
      if(H[i]!=0){
        no += 1;
      }
    }
    if(no==0){
      break;
    }else if(H[(H.size()-no)]==1){
      total += 1;
      H[(H.size()-no)]=0;
    }else{
      total += 1;
      s = H.size()-no;
      H.push_back(H[s]/2);
      H.push_back(H[s]/2);
      H[s]=0;
    }
  }
  cout << total;
}
