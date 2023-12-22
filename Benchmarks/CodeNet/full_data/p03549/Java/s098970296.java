import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int M = sc.nextInt();
   
   int two = 1;
   for(int i=0;i<M;i++) two *=2;
   
   int ans = (1900*M+(N-M)*100)*two;
   System.out.println(ans);
 }
}