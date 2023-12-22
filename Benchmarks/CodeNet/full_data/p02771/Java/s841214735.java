import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    String res = "No";
   
    if((a == b && a != c)||(b == c && b != a)||(c == a && c != b)){res = "Yes";}
System.out.println(res);
  }
}
