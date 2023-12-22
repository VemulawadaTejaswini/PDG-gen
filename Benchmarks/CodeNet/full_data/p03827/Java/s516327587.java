import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    int answer =0;
    int x = 0;
    for(int i=0;i<N;i++){
      if(S.substring(i,i+1).equals("I")){
        x++;
        if(x>answer){
          answer=x;
        }
      }else{
        x--;
      }
    }
    System.out.println(answer);
  }
  

  
}