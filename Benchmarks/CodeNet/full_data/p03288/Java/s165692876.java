import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    if(r<1200){
      System.out.println("ABC");
    }else if(1200<=r && r<2800){
      System.out.println("ARC");
    }else if(r>=2800){
      System.out.println("AGC");
    }
  }
}
