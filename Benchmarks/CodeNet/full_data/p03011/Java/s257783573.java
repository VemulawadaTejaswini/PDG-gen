import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int p = nextInt();
    int q = nextInt();
    int r = nextInt();
    System.out.println(Math.min(p+q, Math.min(q+r, r+p)));
  }
}