import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int p = sc.nextInt();
    int q = sc.nextInt();
    int r = sc.nextInt();
    int min = p;
    if(q < min){
      min = q;
    }
    if(r < min){
      min = r;
    }
    System.out.println(p+q+r-min);
  }
}