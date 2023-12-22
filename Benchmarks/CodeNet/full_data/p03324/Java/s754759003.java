import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int D = Integer.parseInt(sc.next());
    int N = Integer.parseInt(sc.next());
    
    int n = 0;
    if(D == 0){
      n = 1;
    }else if(D == 1){
      n = 100;
    }else{
      n = 10000;
    }
    
    System.out.println(n*N);
  }
}