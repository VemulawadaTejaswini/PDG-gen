#include<iostream>
#include <algorithm>
#include <string>
#include<math.h>
#define rep(i,n)for(int i=0;i<n;i++)
using namespace std;
int main() {
    string a;
    cin >> a;
    if (a[0] == a[1] && a[1] == a[2] || a[1] == a[2] && a[2] == a[3]) {
        cout << "Yes" << endl;
    }
    else {
        cout << "No" << endl;
    }
    return 0;
}