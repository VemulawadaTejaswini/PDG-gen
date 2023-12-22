#include <bits/stdc++.h>
#define rep(i,n) for (int i = 0; i < (n); ++i)
using namespace std;
typedef long long ll;
 
int main() {
	int h,n,a;
	long sum=0;
	cin >> h>> n ;
	
	rep(i,n){
		cin >> a;
		sum += a;
	}
	if(sum >= h) cout << "Yes" << endl;
	else cout << "No" << endl; 
	

	return 0;
}