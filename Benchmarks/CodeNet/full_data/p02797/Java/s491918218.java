import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int s = sc.nextInt();
    for (int i=0; i<n; i++) {
      if (n==1) {
        System.out.println(s);
      }else if (i != n-1) {
        if (i <= k-1) {
          System.out.print(s + " ");
        }else {
          System.out.print("1000000000 ");
        }
      }else {
        System.out.println("1000000000");
      }
    }
  }
}
