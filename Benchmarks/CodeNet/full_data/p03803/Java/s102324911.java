import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    String winner = "";
    if(A == B){
      winner = "Draw";
    }else if (A == 1){
      winner = "Alice";
    }else if(B == 1){
      winner = "Bob";
    }else if(A > B){
      winner = "Alice";
    }else{
      winner = "Bob";
    }
    System.out.println(winner);
  }
}
