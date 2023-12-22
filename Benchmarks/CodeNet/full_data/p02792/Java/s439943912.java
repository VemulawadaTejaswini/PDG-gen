import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int[][] a = new int[10][10];
 
   int ans = 0;
   int tmpa=0;
   int tmpb=0;
   for(int i=1;i<=N;i++)
   {
     tmpa=i;
     tmpb=i;
     tmpa=tmpa%10;
     while(tmpb>=10)
     {
       tmpb/=10;
     }
     a[tmpa][tmpb]++;
   }
   
   for(int i =1; i<=9;i++)
   {
     for(int k =1;k<=9;k++) ans+= a[i][k]*a[k][i];
   }
   System.out.println(ans);
 }
}