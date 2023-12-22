#include <cstdio>

int main(void)
{
	int a1count=0,a2count=0,a4count=0;
	int i,N,x;
	scanf("%d",&N);
	while(N--)
	{
		scanf("%d",&x);
		if(x%4==0)
			a4count++;
		else if(x%2==0)
			a2count++;
		else
			a1count++;
	}
	if(a2count>0 && a1count<=a4count)
		printf("Yes\n");
	else if(a2count==0 && a1count<=a4count+1)
		printf("Yes\n");
	else
		printf("No\n");

	return 0;
}