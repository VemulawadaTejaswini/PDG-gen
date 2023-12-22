#include<iostream>
#include <algorithm>
#include <string>
#include<math.h>
#define rep(i,n)for(int i=0;i<n;i++)
using namespace std;
int main() {
    int a, b, c, d;
    cin >> a >> b >> c >> d;
    int L = a + b;
    int R = c + d;
    if (L == R) {
        cout << "Balanced" << endl;
    }
    else if (L < R) {
        cout << "Right" << endl;
    }
    else {
        cout << "Left" << endl;
    }
    return 0;
}