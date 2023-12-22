#include <stdio.h>

int main(void)
{
  const int N, K;
  scanf("%d %d", &N, &K);

  int no[10] = {0};

  for(int i = 0; i < K; i++){
    int d;
    scanf("%d", &d);
    no[d] = 1;
  }

  int i = N;
  for(; i <= 10*N; i++){
    int j = i;
    while(j > 0 && !no[j%10]) j /= 10;
    if(!j) break;
  }
  printf("%d", i);
  return 0;
}
