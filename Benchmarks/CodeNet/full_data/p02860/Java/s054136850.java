import java.util.*;

class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();

    int num = 0;
    int a = N%2;    

    if(a == 0){
      for(int i=0; i<N/2; i++){
         if(S.charAt(i) == S.charAt(i+N/2)){

         num++;

         } else{

           System.out.println("No");

         }
      }
    }else{
      
    System.out.println("No");
     
    }
    
    System.out.println("Yes");
  }
}