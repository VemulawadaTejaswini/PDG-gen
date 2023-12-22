#include<stdio.h>

int main()
{
   int n,a,b;
   scanf("%d %d %d",&n,&a,&b);
   int min=(a * ( n - 1 ) + b );
   int max = a + ( n - 1 ) * b;
   if(n == 1 && a == b) 
         printf("1");
   else if(a > b || ( n == 1 && a != b )) 
         printf("0");
   else 
         printf("%d",max - min + 1);
   
   
    return 0;
}
    
