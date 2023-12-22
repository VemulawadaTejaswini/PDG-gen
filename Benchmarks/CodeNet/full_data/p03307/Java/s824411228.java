import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    
    if(N % 2 == 0){
      System.out.print(N);
    }else{
      System.out.print(N * 2);
    }
  }
}