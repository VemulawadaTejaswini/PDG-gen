import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String n = sc.next();
    int count = 0;
    for(int j = 0; j < n.length(); j++)
      count += n.charAt(j);
    int a = (int)n;
    if(a % count == 0)
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}
