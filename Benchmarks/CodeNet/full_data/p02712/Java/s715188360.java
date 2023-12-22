import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int result = 0;
    for(int i = 1; i < x+1; i++)
    {
      if(x % 3 == 0 && x % 5 == 0)
      {
    	 continue;
      }
      
      if(x % 3 == 0)
      {
    	 continue;
      }
      if(x % 5 == 0)
      {
    	 continue;
      }
      result += i;
    }
    System.out.println(result);
  }
}
