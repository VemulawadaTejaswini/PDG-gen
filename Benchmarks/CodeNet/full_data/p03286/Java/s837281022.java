import java .util.*;
class Main 
{
public static void main (String[] args)
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] a= new int[100];
int k =0;
do{
int m= n%4;
if(m==2) m=-2;
else if(m==3) m=-1;
n-=m;
n /=4;

if(m==0){a[k] =0; a[k++]=0;}
else if(m ==1){a[k] =1; a[k++]=0;}
else if(m==-2){a[k]=0;a[k++]=1;}
else{a[k]=1;a[k++]=1;}
}while(n>0);
for(int i =k;i>=0;i--)
{
System.out.print(a[i]);
}
}
}