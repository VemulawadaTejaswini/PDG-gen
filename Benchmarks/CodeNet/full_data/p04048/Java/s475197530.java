import java.util.*;

class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt(), x = scan.nextInt();

    System.out.println(n+calc(x,n-x));
  }

  static int calc(int a,int b) {
    if(b%a==0) {
      return b*2-a;
    }else {
      return (b/a)*a*2+calc(b%a,a);
    }
  }
}
