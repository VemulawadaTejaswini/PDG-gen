import java.util.*;
 
class Main{
  public static void main(String[] args){
    Scanner ISR = new Scanner(System.in);
    int N = ISR.nextInt();
    String St = ISR.next();
    int R = 0;
    for(int i = 0;i<N-2;i++){
      if(St.charAt(i).equals("A")){
        if(St.charaAt(i+1).equals("B")){
          if(St.charAt(i+2).equals("C")){
            R++;
          }
        }
      }
    }
    System.out.println(R);
  }
}