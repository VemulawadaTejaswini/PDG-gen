import java.util.* ;
public class Main{
  public static void main(String args[]){
       	Scanner sc = new Scanner(System.in);
    int A = sc.nextInt() ;
    int B = sc.nextInt() ;
    int plus = A+B;
    int minus = A-B;
    int kakeru = A*B;
    
    if(B>-B){
      if(plus<kakeru)
        System.out.println(kakeru);
      else
        System.out.println(plus);
    }else{
      if(minus<kakeru)
        System.out.println(kakeru);
      else
        System.out.println(minus);
      
    } 
  }
}