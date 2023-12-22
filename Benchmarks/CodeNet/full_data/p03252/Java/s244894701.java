import java.util.*;
class Main {
  public static void main (String[] args)  {
    
    Scanner sc = new Scanner(System.in);
    
    String S=sc.next();
    String T=sc.next();
    
     
     int [] as= new int [26];
      int [] at= new int [26];
     
     
     for(int i=0;i<26;i++){
      as[i]=-1;
      at[i]=-1;
     }
     
     int tv = 0;
     int sv = 0;
     
     for(int i=0; i<S.length(); i++){
       tv = T.charAt(i)-97;
       sv = S.charAt(i)-97;
       
       if(as[sv]!=-1&& as[sv]!=tv){
         System.out.println("No");
         System.exit(0);
         }
       
       if(at[tv]!=-1&& at[tv]!=sv){
         System.out.println("No");
         System.exit(0);
         }
       
       at[tv]=sv;
       as[sv]=tv;
       
       }
     
     
        
       System.out.println("Yes");
       
  }
}