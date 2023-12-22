import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int a[] = {0, 1, 2, 1, 3, 1, 3, 1, 1, 3, 1, 3, 1};
    System.out.println(a[x] == a[y] ? "Yes" : "No");
  }
}