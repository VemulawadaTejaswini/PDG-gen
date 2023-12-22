#include<stdio.h>
#include<string.h>

int main(void){
    char S[100];
    char T[100];
    int A,B;
    char U[100];

    scanf("%s", &S);
    scanf("%s", &T);
    scanf("%d", &A);
    scanf("%d", &B);
    scanf("%s", &U);

    if(strcmp(S, U) == 0){
        puts(S - 1, T);
    }else if(strcmp(T, U) == 0){
        puts(S, T - 1);
    }
    return 0;
}