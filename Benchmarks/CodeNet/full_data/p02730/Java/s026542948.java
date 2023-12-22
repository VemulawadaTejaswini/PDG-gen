import java.util.*;
public class Main{
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String  S = sc.next();
     boolean ans=true;
     String S1,S2;
     int n,i;
    
     n = S.length();
     S1=S.substring(0,(n-1)/2);
     S2=S.substring((n+3)/2-1,n);
     String[] s=S.split("",0);
     String[] s1=S1.split("",0);
     String[] s2=S2.split("",0);
     for(i=0;i<(n+1)/2;i++){
       if(!s[i].equals(s[n-i-1])){
         ans = false;
       }
     }
     n = S1.length();
     for(i=0;i<(n+1)/2;i++){
       if(!s1[i].equals(s1[n-i-1])){
         ans = false;
       }
     }
     n = S2.length();
     for(i=0;i<(n+1)/2;i++){
       if(!s2[i].equals(s2[n-i-1])){
         ans = false;
       }
     }
     if(ans){
       System.out.println("Yes");
     }else{
       System.out.println("No");

     }
   }
}
