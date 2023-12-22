import java.util.*

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int i = scanner.nextInt();
    if(i < 1200){
      System.out.println("ABC");
    }else if(i < 2800){
      System.out.println("ARC");
    }else{
      System.out.println("AGC");
    }
  }
}