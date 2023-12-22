#include <stdio.h>

int main() {
  int number = 0, i;
  char str[5];
  scanf("%s", str);
  for(i = 0; i < number; i++) {
    if(str[i] == '+') {
      number++;
    } else {
      number--;
    }
  }
  printf("%d\n", number);
  return 0;
}
