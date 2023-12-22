#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
#include <time.h>

#define _CRT_SECURE_NO_WARNINGS
#define TLong long long
#define TBMod 1000000007

int main(int argc, char const *argv[])
{
	int n,m;
	int k,t;
	int cnt[30],ans = 0;
	for (int i = 0; i < 30; ++i)	cnt[i] = 0;
	scanf("%d %d",&n,&m);
	for (int i = 1; i <= n; ++i){
		scanf(" %d",&k);
		for (int j = 1; j <= k; ++j){
			scanf(" %d",&t);
			++cnt[t - 1];
		}
	}
	for (int i = 0; i < m; ++i)
	{
		if(cnt[i] == n)	++ans;
	}
	printf("%d\n", ans);
	return 0;
}
