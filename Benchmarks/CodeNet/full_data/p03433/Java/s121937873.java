#include <bits/stdc++.h>
using namespace std;

int main(){
    int N, A;
    cin >> N >> A;

    int div = N/ 500;
    if(N - div*500 <= A){
        cout << "Yes" << endl;
    }else{
        cout << "No" << endl;
    }

    return 0;
}