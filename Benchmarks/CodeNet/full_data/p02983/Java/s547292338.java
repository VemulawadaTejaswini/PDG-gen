import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int l = stdIn.nextInt();
    int r = stdIn.nextInt();
    int k = 0;
    if(l>r) {
      k = l - r;
    } else if(l<r) {
      k = r - l;
    } else if(l==r) {
      k = (l*r)%2019;
      System.out.println(k);
      System.exit(0);
    }
    int a = Math.max(l,r);
    int b = Math.min(l,r);
    int min = 2018;
    for(int i = b;i<=a;i++) {
      for(int j = i+1;j<=a;j++) {
        min = Math.min((i*j)%2019,min);
      }
    }
    System.out.println(min);
  }
}
