import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Mustafa
{
  public static void main(String[] args) throws FileNotFoundException
  {
    Scanner scanner = new Scanner(System.in);
    int n, m;
    n = scanner.nextInt();
    m = scanner.nextInt();
    if(n != m){
      System.out.println("No");
    }else{
      System.out.println("Yes");
    }
  }
}
