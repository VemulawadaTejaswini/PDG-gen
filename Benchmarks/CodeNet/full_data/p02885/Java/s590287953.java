//#include <bits/stdc++.h>
#include <stdio.h>
#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
#include <cmath>

using namespace std;

int main() {
    cin.tie(0);
    ios::sync_with_stdio(false);


    int a, b;

    cin >> a >> b;

    int x = a - b * 2;

    if(x < 0) {
        x = 0;
    }

    cout << x << endl;
}