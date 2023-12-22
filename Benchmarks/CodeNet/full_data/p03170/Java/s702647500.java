#include<bits/stdc++.h>
using namespace std;
#define int long long
signed main(){
	int n,k;
	cin >> n >> k;
	vector<int> a(n);
	for(int i = 0;i < n; ++i) cin >> a[i];	
	// dp[i] true only if i can gaurantee i can come here
	vector<bool> dp(k + 1);
	for(int i = 1;i <= k; ++i){
		for(int j = 0;j < n; ++j){
			// suppose i - a[j] is true then i cannot come here
			// if false then i can come here 
			if(i - a[j] >= 0){
				if(dp[i - a[j]] == false)dp[i] = true;
			}
		}
	}
	cout << (dp[k] == true ? "First":"Second");
}