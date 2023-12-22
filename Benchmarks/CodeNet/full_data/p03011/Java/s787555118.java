import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int p = sc.nextInt();
    int q = sc.nextInt();
    int r = sc.nextInt();
    int max = p;
    if(q > max){
      max = q;
    }
    if(r > max){
      max = r;
    }
    System.out.println(p+q+r-max);
  }
}
