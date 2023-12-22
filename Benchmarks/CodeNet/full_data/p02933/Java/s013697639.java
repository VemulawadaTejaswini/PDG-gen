#include <stdio.h>
int main(void){
    int a;
    char s[11];
    scanf("%d %s",&a,s);
    if(a>=3200)
        printf("%s",s);
    else
        printf("red");
}
