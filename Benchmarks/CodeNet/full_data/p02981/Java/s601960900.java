import java.util.*;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n, a, b;

    n = sc.nextInt();
    a = sc.nextInt();
    b = sc.nextInt();
	
    int train = n*a;
    if(train <= b){
      System.out.println(train);
    }
    else{
      System.out.println(b);
    }
  }
}