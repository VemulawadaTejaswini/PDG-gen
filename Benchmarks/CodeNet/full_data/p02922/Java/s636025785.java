import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int ans = 0;
    if(B==1){ System.out.println(0); return; }
    for (int i=1;i<=B;i++){
      int T = (A*i) - (i-1);
      if (T>=B){
        System.out.println(i); break;
      }
    }
  }
}