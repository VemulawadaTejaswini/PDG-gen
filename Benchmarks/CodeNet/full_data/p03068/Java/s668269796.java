import java.util.*;

class Main {
    

  public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    int N=sc.nextInt();
    String l=sc.next();
    int K=sc.nextInt();
    char t=l.charAt(K-1);
      
      for(int i=0; i<l.length();i++){
          if(l.charAt(i)!=t&&l.charAt(i)!='*'){
              l=l.replace(l.charAt(i), '*');
          }
          
      }
          System.out.println(l);
          
  }
}
