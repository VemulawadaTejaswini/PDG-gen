#include <stdio.h>
#include <string.h>
#include <math.h>
 
main(){
        char a[4],b[4];
        int num;
 
        scanf("%s %s",a,b);
        char *c;
        c = strcat(a , b);
 
        num = atoi(c);
 
        int n = sqrt(num);
        if(n*n == num && c != 100100){
                printf("Yes");
        }else if(n*n != num && c != 100100){
                printf("No");
        }else if(c == 100100){
        		printf("No");
        }
}