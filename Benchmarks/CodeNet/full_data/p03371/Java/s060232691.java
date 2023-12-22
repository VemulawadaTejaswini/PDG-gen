import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);

   int A = sc.nextInt();
   int B = sc.nextInt();
   int C = sc.nextInt();
   int X = sc.nextInt();
   int Y = sc.nextInt();
   
   int a =0;
   if(X>Y)
   {
     int[] ans ={2*C*X,2*C*Y+A*(X-Y),A*X+B*Y};
     Arrays.sort(ans);
     a=ans[0];
   }
   else
   {
     int[] ans2 ={2*C*Y,2*C*X+B*(Y-X),A*X+B*Y};
     Arrays.sort(ans2);
     a=ans2[0];
   }
   System.out.println(a);
 }
}