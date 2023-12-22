import java.util.*;
public class Main{
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int  n = sc.nextInt();
     String s = sc.next();
     String ans="";
     int flag=1;
     String  form,back;
     if(n%2==0){
 
         form=s.substring(1,n/2);
         back=s.substring(n/2+1,n);
         if(form.equals(back)){
           ans = "Yes";
         }else{
           ans = "No";
         }
       
     }else{
       ans = "No";
     }
     System.out.println(ans);
   }
}