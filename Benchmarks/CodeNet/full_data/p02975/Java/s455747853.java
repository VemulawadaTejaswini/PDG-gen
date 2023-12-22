#include <cstdio>
#include <cstring>
#include <algorithm>
#include <vector>
#include <queue>
#include <map>
#include <iterator>
#include <cmath>
#include <set>
#include <deque> 
#include <string>


using namespace std;

int n;
int a[100010];
bool isUsed[100010];
std::map<int, int> countMap;
std::map<int, int> calcMap;

int ans[100010];

bool doSearch(int num)
{
	int p = 2;

	while (p < n)
	{
		ans[p] = ans[p - 2] ^ ans[p - 1];
		p++;
		
//		if (calcMap[ans[p]] == 0)
//		{
//			return false;
//		}
//		else
//		{
//			calcMap[ans[p]]--;
//			p++;
//		}
	}
	
//	if ((ans[0] == (ans[1] ^ ans[n - 1])) && (ans[n - 1] == (ans[0] ^ ans[n - 2])))
	{
		for (int i = 0 ; i < n ; i++)
			printf("%d ", ans[i]);
		printf("\n");
		return true;
	}
//	else
//	{
//		return false;
//	}
	

	
	
	
}

int main()
{
	scanf("%d", &n);
	for (int i = 0 ; i < n ; i++)
	{
		scanf("%d", &(a[i]));
		countMap[a[i]]++;
//		isUsed[i] = false;
	}
//	printf("finish\n");

	if (n % 3 != 0)
	{
		printf("No\n");
		return 0;
	}
	
	ans[0] = a[0];
//	isUsed[0] = true;



	
	for (int i = 1 ; i < n ; i++)
	{
		ans[1] = a[i];
		ans[2] = ans[0] ^ ans[1];
		
		calcMap[ans[0]] += n / 3;
		calcMap[ans[1]] += n / 3;
		calcMap[ans[2]] += n / 3;
		
		if ((calcMap[ans[0]] == countMap[ans[0]])
			&& (calcMap[ans[1]] == countMap[ans[1]])
			&& (calcMap[ans[2]] == countMap[ans[2]]))
		{
			printf("Yes\n");
			return 0;
		}
	}
	
	printf("No\n");
	return 0;
}
