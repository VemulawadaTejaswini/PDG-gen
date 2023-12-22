#include<stdio.h>
int main(){
   char S[100];
   scanf("%s",S);
   for(int i=0;S[i]!='\0';i++){
      S[i]='x';
      printf("%c",S[i]);
   }
   printf("\n");
   return 0;
}
