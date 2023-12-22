#include <stdio.h>

int main()
{
    int a, b;
    scanf("%d%d", &a, &b);
    int ans = 0;
    if( a == b){
        ans += 2*a;
    }else if ( a > b){
        ans += a+(a-1);
    }else{
        ans += b+(b-1);
    }
    printf("%d\n", ans);
    return 0;
}