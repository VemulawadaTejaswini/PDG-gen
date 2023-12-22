#include<iostream>
#include <algorithm>
#include <string>
#include<math.h>
#define rep(i,n)for(int i=0;i<n;i++)
using namespace std;
int main() {
    int a, b, c;
    cin >> a >> b >> c;
    cout << (a*b > c ? c : a*b) << endl;
    return 0;
}