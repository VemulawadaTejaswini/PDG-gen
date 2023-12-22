import java.util.*;
class Main{
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int A = sc.nextInt();
  int B = sc.nextInt();
  int G = B-A+1;
  for(int i=0;i<2*A-1;i++){
   if(G<=1000000&&G>=-1000000){
    System.out.println(G);
   }
   G++;
  }
 }
}