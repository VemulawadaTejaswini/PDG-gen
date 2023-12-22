#include <stdio.h>
#include <stdlib.h>

int main()
{        char x[10];
        scanf("%s",&x);
        if(x=="Sunny")
            printf("Cloudy");
        else if(x=="Cloudy")
            printf("Rainy");
        else if(x=="Rainy")
            printf("Sunny");
    return 0;
}
