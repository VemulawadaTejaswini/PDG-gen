import java.util.*;

public class Main {
  public static void main(String[] args ){
    Scanner sc = new Scanner(System.in);
    int K = sc.nextInt();
    int X = sc.nextInt();
    
    if(K>=X){
      System.out.printnln("Yes");
    }
    else{
      System.out.printnln("No");
    }
  }
}