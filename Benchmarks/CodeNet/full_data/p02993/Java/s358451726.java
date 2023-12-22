import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int x = 0;
    for(int i=1 ; i<4 ; i++){
      if(s.charAt(i)==s.charAt(i-1)){
        x = 1;
      }
    }
    if(x==1){
      System.out.println("Bad");
    }else{
      System.out.println("Good");
    }
  }
}
