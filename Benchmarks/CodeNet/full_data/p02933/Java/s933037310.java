#include <iostream>
#include <cstdio>
#include <string>
using namespace std;

char s[1000000];
int arr;
int main(){
	scanf("%d%s",&arr,&s);
	if(arr>=3200){
		cout <<s<<endl;
	}else{
		cout <<"red"<<endl;
	}
	return 0;
}