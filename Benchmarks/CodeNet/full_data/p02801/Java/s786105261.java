#include <stdio.h>

int main(void)
{
    char s;
    scanf("%c", &s);

    printf("%c", s + 0x01);

    return 0;
}