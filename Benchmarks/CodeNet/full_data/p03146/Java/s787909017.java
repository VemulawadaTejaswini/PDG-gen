#include <bits/stdc++.h>
using namespace std;

int main() {

  int s;
  cin >> s;

  vector<int> array(1001000);

  bool valid = true;

  int count = 2;

  array[s]++;

  while (valid) {

    if (s % 2 == 0) {
      s = s / 2;
    } else {
      s = 3 * s + 1;
    }

    if (array[s] != 0) {
      valid = false;
    } else {
      array[s]++;
      count++;
    }

  }

  cout << count << endl;

}