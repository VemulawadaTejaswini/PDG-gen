import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt(); 
    int B = sc.nextInt();
    int a = A;
    int b = B;
    int r = 1;
    for (;r!=0;){
      r = a % b;
      a = b;
      b = r;
    }
    int ans = A * B / a;
    System.out.println(ans);
  }
}