#include <stdio.h>
#include <stdlib.h>

int main(void)
{
  int N, M;
  scanf("%d%d", &N, &M);
  long ans = abs((N-2)*(M-2));
  printf("%ld\n", ans);
  return 0;
}
