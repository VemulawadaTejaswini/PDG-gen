 #include <bits/stdc++.h>

 using namespace std;

 int main() {
 int M, D; cin >> M >> D;
 int ans = 0;
 for (int m = 1; m <= M; ++m) {
 for (int d = 10; d <= D; ++d) {
 int d_1 = d % 10, d_10 = d / 10;
 if (d_1 >= 2 && d_10 >= 2 && d_1 * d_10 == m) {
 ++ans;
 }
 }
 }
 cout << ans << endl;
   return 0 ; 
 }