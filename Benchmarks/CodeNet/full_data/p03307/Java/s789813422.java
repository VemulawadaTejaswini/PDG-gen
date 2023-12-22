import java.util.*;

public class Main
{
  public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
	int i = n;
    while (i % 2 != 0) {
      i += n;
    }
    System.out.println(i);
  }
}
