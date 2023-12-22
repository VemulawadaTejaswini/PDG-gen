import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int A = sc.nextInt();
   int B = sc.nextInt();
   int C = sc.nextInt();

   int[] aa = {A,B,C};
   Arrays.sort(aa);
   System.out.println(aa[0]+aa[1]+aa[2]*10);
 }
}