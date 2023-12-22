#include<bits/stdc++.h>
using namespace std;
void slove(int question_num) {
    while (question_num--) {
        int n;
        cin >> n;
        cout << n / 2 + (n % 2 ? 1 : 0);
    }
}
int main() {
    //ios::sync_with_stdio(false);
    int num = 1;
    //    read(num);
    slove(num);
    return 0;
}
