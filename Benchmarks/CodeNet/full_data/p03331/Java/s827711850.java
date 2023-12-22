import java.util.Scanner;
public class Main{
  public static void main(String[] arsgs){
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int result = 0;
    if(n%10==0){
      System.out.println(10);
    }
    else{
      while(n != 0){
        result += n%10;
        n = n/10;
      }
      System.out.println(result);
    }
  }
}