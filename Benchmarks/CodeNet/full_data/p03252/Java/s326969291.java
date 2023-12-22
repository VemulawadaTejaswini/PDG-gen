import java.util.*;
class Main {
  public static void main (String[] args)  {
    
    Scanner sc = new Scanner(System.in);
    
    String S=sc.next();
    String T=sc.next();
    
     
     int [] alph = new int [26];
     
     for(int i=0;i<26;i++){
      alph[i]=-1;
     }
     
     int tv = 0;
     int sv = 0;
     
     for(int i=0; i<S.length(); i++){
       tv = T.charAt(i)-97;
       sv = S.charAt(i)-97;
       
       if(alph[tv]==-1){
                alph[tv]=sv;
        }else if(alph[tv]!=sv){
          System.out.println("No");
          System.exit(0);
          }
       }
     
     
        
       System.out.println("Yes");
       
  }
}