#include<stdio.h>

int main(void){
	int table[9][9];
	for(int i = 1; i <= 9; i++){
		for(int j = 1; j <= 9; j++){
			table[i-1][j-1] = i * j;
		}
	}
	int N = 0;
	scanf("%d", &N);
	for(int i = 0; i < 10; i++){
		for(int j = 0; j < 10; j++){
			if(table[i][j] == N){
				printf("Yes\n");
				return 0;
			}
		}
	}
	printf("No\n");
	return 0;
}
