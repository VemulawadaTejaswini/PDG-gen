import java.util.*;

class Main{
  public static void main(String[] args){
    if (isDenied()) {
      System.out.println("DENIED");
    } else {
      System.out.println("APPROVED");
    }
  }
  static boolean isDenied(){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    boolean ans = false;
    for (int i=0;i<=N;i++){
      int A = sc.nextInt();
      if (A%2==0){
        if (A%3!=0 || A%5!=0){
          ans = true;
          break;
        }
      }
    }
    return ans;
  }
}