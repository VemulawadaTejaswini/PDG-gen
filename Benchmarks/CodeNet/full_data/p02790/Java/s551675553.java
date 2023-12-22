import java.util.*;
public class Main{
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int  n = sc.nextInt();
     int m = sc.nextInt();
     int ans=0;
     if(n <= m){
       for(int i=0;i<m;i++){
         ans+=Math.pow(10,i)*n;
       }
     }else{
       for(int i=0;i<n;i++){
         ans+=Math.pow(10,i)*m;
       }
     }
     System.out.println(ans);
   }
}
