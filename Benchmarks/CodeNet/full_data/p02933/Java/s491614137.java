#include <iostream>
#include <cstdio>
using namespace std;
char s[1000000];
int arr;
int main(){
	scanf("%d%s",&arr,&s);
	if(arr>=3200){
		printf("%s",&s);
	}else{
		printf("red");
	}
	return 0;
}