#include <iostream>
using namespace std;
int main() 
{
	int n,W;
	cin >> n >> W;
	int v[n+1];
	int w[n+1];
	for(int i = 1 ; i <= n ; i++) cin >> w[i] >> v[i];
	long long int dp[n+1][W+1];
	for(int i = 0 ; i < W+1 ; i++) dp[0][i] = 0;
	for(int i = 1 ; i < n+1 ; i++)
	{
	      for(int j = 1 ; j < W+1 ; j++)
	      {
	            if(j-w[i] < 0) dp[i][j] = dp[i-1][j];
	            else dp[i][j] = max(dp[i-1][j-w[i]]+v[i],dp[i-1][j]);
	      }
	}
	cout << (dp[n][W]);
	return 0;
}