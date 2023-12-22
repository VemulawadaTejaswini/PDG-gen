import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int p=sc.nextInt();//a-b
    int q=sc.nextInt();//b-c
    int r=sc.nextInt();//c-a

    int min=Math.min(p+q,r+q);
        min=Math.min(min,p+r);
        min=Math.min(min,q+r);
        min=Math.min(min,r+p);
        min=Math.min(min,q+p);

    System.out.println(min);
  }
}
