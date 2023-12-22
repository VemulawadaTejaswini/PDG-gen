#include<iostream>
#include<string>
#include<vector>
#include<list>
#include<cmath>
#include<algorithm>
#include<cstdio>
#include<set>
#include<map>
#include<queue>
#include<cstring>
#include<sstream>
using namespace std;

typedef long long ll;

int main() {
  int N,K; cin >> N >> K;
  string s; cin >> s;
  for ( int i = 0; i < N; i++ ) {
    if ( i + 1 == K ) s[i] = s[i]+32;
  }
  cout << s << endl;
  return 0;
}
