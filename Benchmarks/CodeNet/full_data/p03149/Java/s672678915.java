#include <bits/stdc++.h>
using namespace std;

class Main{
  private:
  	
  public:
int n;
};
int main()
{
  int n;
  cin >> n;
  //cout << n <<endl;
  vector<int> list(n);
  for(int i =0 ; i < n; i++){
    cin >> list.at(i);
  }
  vector<string> str(n);
  for(int i = 0; i < n ; i++){
    stringstream ss;
    ss << bitset<100>(list.at(i));
    //cout << ss.str() << endl;
  	str.at(i) = ss.str() ;
  }
  vector<int> m(100);
  for(int j = 0; j < 100; j++){

    if(str.at(0).at(j) != str.at(1).at(j)){
      m.at(j) += 1;
    }
  }
  
  for(int i = 2; i < n ; i++){
    for(int j = 0; j < 100; j++){

      if(str.at(i).at(j) == '1'){
        m.at(j) += 1;
      }
    }
  }

  for(int i = 0; i < 100; i++){
    m.at(i) = m.at(i)%2;

    
  }
  string s;
  s = (accumulate(m.begin(), m.end(), 0) == 0)? "YES" : "NO";
  cout << s;
}