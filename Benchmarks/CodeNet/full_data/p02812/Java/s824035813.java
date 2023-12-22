import java.util.*;
 
class Main{
  public static void main(String[] args){
    Scanner ISR = new Scanner(System.in);
    int N = ISR.nextInt();
    String St = ISR.next();
    int R = 0;
    for(int i = 0;i<N-2;i++){
      if(charAt(i).equals("A")){
        if(charaAt(i+1).equals("B")){
          if(charAt(i+2).equals("C")){
            R++;
          }
        }
      }
    }
    System.out.println(R);
  }
}