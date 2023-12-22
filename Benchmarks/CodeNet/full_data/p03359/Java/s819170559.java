#include <stdio.h>

int main(void)
{
  int a, b;
  scanf("%d%d", &a, &b);
  int days = a-1;
  if(b >= 5) days++;
  printf("%d\n", days);
}