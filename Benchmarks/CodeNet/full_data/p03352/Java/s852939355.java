import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
 
   int N = sc.nextInt();
 
   Integer[] beki = new Integer[43];
   for(int i=1;i<=31;i++) beki[i-1]=i*i;
   for(int i=2;i<=10;i++) beki[i+29]=i*i*i;
   for(int i=2;i<=3;i++) beki[i+38]=i*i*i*i*i;
   beki[42]=128;
   
   for(int i=N;true;i--)
   {
     if(Arrays.asList(beki).contains(i))
     {
       System.out.println(i);
       break;
     }
   }
 }
}