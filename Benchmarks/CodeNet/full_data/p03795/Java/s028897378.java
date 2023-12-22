import java.utl.*;
public class Main{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int x = 800*n;
  int y = 200*(n/15);
  
  int result = x - y;
  System.out.println(result);
  }
}
