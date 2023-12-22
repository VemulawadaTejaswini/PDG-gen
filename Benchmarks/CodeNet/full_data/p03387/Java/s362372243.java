import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
 
   int A = sc.nextInt();
   int B = sc.nextInt();
   int C = sc.nextInt();
 
   int[] aaa = {A,B,C};
   Arrays.sort(aaa);
   
   int sum = 0;
   sum+= aaa[2]-aaa[1];
   if((aaa[1]-aaa[0])%2==1) sum+=2+(aaa[1]-aaa[0])/2;
   else sum+=(aaa[1]-aaa[0])/2;
   
   System.out.println(sum);
 }
}