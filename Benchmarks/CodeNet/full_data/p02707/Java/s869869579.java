import java.util.*;
public class Main{
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int[] a = new int[n+1];
     int i;
     for(i=0;i<n;i++){
       a[sc.nextInt()]++;
     }
     for(i=1;i<=n;i++){
       System.out.println(a[n]);
     }
   }
}
