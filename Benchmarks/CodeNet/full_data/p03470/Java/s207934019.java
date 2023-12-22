
#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

int main() { 
	int N,count = 1;
  cin >> N;
	vector<int> a(N);
  for (int i = 0; i < N; i++) {
          cin >> a.at(i);
  }

  sort(a.begin(), a.end() );

  for (int i = 0; i < N - 1; i++) {

	  if (a[i] != a[i + 1]) {
      count++;
      }
   }
  cout << count << endl;
}