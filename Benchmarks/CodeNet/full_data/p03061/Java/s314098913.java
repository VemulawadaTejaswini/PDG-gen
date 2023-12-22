import java.util.Scanner;
import java.util.ArrayList;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int max = sc.nextInt();
   ArrayList<Integer> arr = new ArrayList<>(max);
   ArrayList<Integer> Garr = new ArrayList<>(max-1);
   for(int i=0;i<max;i++){
   int C = sc.nextInt();
   arr.add(C);
   }
   int m = gcd(arr.get(0),arr.get(1));
   Garr.add(m);
   int gcdmem = m;
 for(int k=2;k<max;k++){
   gcdmem = gcd(arr.get(k),gcdmem);
   Garr.add(gcdmem);
 }
   int gcdmin = Garr.get(0);
   int gcdminnum = 0; 
   for (int i=0;i < Garr.size();i++)
   {
    if(gcdmin > Garr.get(i))
    {
      gcdminnum = i;
      gcdmin = Garr.get(i);
    }
   }
   if(gcdminnum == 0) arr.set(1,arr.get(0));
   else arr.set(gcdminnum+1,arr.get(0));
   
  int ma = gcd(arr.get(0),arr.get(1));
   int gcdmem_a = ma;
 for(int k=2;k<max;k++){
   gcdmem_a = gcd(arr.get(k),gcdmem_a);
 }
   
    System.out.print(gcdmem_a);
   
   
 }
  static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
}