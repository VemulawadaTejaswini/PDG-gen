import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int n = Math.min(a,b);
    int n2 = Math.max(a,b);
    for(int i = 0; i < n2; i++){
      System.out.print(n);
    }
  }
}
