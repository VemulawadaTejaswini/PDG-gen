#include <stdio.h>

int main(void){
int L;
int R;
int i;
int j;


    scanf("%d",&L);
    scanf("%d",&R);

    int min2;
    for(j = R; j > L; j--){
         min2 = R % 2019;
        if(min2 > (j % 2019))
            min2 = j % 2019;
    }

    int min1;
    for(i = L; i < j; i++){
         min1 = L % 2019;
        if(min1 > (i % 2019))
            min1 = i % 2019;
    }

    printf("%d",min1 + min2);

}