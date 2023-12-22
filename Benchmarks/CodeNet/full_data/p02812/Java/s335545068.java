import java.util.*;
 
class Main{
  public static void main(String[] args){
    Scanner ISR = new Scanner(System.in);
    int N = ISR.nextInt();
    String St = ISR.next();
    int R = 0;
    for(int i = 0;i<N-2;i++){
      if(St.substring(i,i+3).equals("ABC")){
        i+=2;
      }
    }
    System.out.println(R);
  }
}