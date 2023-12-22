#include "stdio.h"

int main(){
    char l[101];
    scanf("%s%ld",l);
    for(int i=0;i<100;i++){
        if(l[i]!='1'){
            printf("%c\n",l[i]);
            return 0;
        }
    }
    printf("1\n");
    return 0;
}