import java.util.*;
public class Main{
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int  N = sc.nextInt();
     int L = sc.nextInt();
     int ans=0;
     if(L*(L+N-1)<0){
       for(int i=1;i<N+1;i++){
         ans+=L+i-1;
       }
     }else if(L<0){
       for(int i=1;i<N;i++){
         ans+=L+i-1;
       }
     }else{
       for(int i=2;i<N+1;i++){
         ans+=L+i-1;
       }
     }
     System.out.println(ans);
   }
}
