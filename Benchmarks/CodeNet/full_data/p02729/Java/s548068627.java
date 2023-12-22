#include <stdio.h>

int main(void) {
  int N;
  int M;
  scanf("%d", &N);
  scanf("%d", &M);
  int cnt_a = 0;
  int cnt_b = 0;

  cnt_a = (N * (N - 1)) / 2;
  cnt_b = (M * (M - 1)) / 2;
  int sum = cnt_a + cnt_b;
  printf("%d\n", sum);
  return 0;
}
