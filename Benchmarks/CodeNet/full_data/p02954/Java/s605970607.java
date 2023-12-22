import java.util.*;
public class Main{
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String  S = sc.next();
     int n = S.length();
     char[] h = new char[n+1];
     int i,index=0,r=0,l=0;
     int[] ans = new int[n];
     for(i=0;i<n;i++){
       h[i]=S.charAt(i);
     }
     h[n]='R';
     for(i=0;i<n;i++){
       if(h[i]=='R'){
         r++;
       }else{
         l++;
       }
       if(h[i]=='R' &&h[i+1]=='L'){
         index=i;
       }
       if(h[i]=='L' && h[i+1]=='R'){
         if((l-r)%2==0){
           ans[index]=(l+r)/2;
           ans[index+1]=(l+r)/2;
           l=0;
           r=0;
         }else if(r>l){
           if((r+l)%4==3){
             ans[index]=(l+r-1)/2;
             ans[index+1]=(l+r+1)/2;
           }else{
             ans[index]=(l+r+1)/2;
             ans[index+1]=(l+r-1)/2;
           }
           l=0;
           r=0;
         }else{
           if((r+l)%4==3){
             ans[index] = (l+r+1)/2;
             ans[index+1] = (l+r-1)/2;
           }else{
             ans[index] = (l+r-1)/2;
             ans[index+1] = (l+r+1)/2;
           }
           l=0;
           r=0;
         }
       }
     }
     for(i=0;i<n;i++){
       System.out.print(ans[i]);
     }

   }
}
