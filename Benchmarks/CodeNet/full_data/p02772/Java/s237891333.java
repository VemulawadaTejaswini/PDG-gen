import java.util.ArrayList;
import java.util.*;
public class Main{
     public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      List<Integer> l=new ArrayList();
      List<Integer> samp=new ArrayList();
      for(int i=0;i<n;i++)
         l.add(sc.nextInt());
      
      int flag=0;
      Collections.sort(l);
      for(int i=0;i<n;i++){
         if(l.get(i)%2==0){
            samp.add(l.get(i));
         }
      }
      for(int i=0;i<samp.size();i++){
         
         if(samp.get(i)%3==0 || samp.get(i)%5==0){
            flag=1;  
            continue; 
         }else{
            flag=0;
            break;
         }

      }

      if(flag==1)
      System.out.println("APPROVED");
      else
      System.out.println("DENIED");
      
   }
}  