#include<iostream>
#include <math.h>
using namespace std;
int main(){
    long long n;
    cin >> n;

    int ans = 10;
    for(long long i=1; i<=sqrt(n); i++){
        long long j = n / i;
        if(n == i*j){
            int f = max((int)log10(i)+1, (int)log10(j)+1);
            ans = min(ans, f);
        }
    }
    cout << ans << endl;
    return 0;
}