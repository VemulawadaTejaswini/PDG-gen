import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int W1 = 0;
    int H1 = 0;
    int W2 = sc.nextInt();
    int H2 = sc.nextInt();
    int N = sc.nextInt();
    for(int i=0;i<N;i++){
      int x = sc.nextInt();
      int y = sc.nextInt();
      int a = sc.nextInt();
      if(a==1){
        W1 = x;
      }else if(a==2){
        W2 = x;
      }else if(a==3){
        H1 = y;
      }else{
        H2 = y;
      }
    }
    int ans = (W2-W1)*(H2-H1);
    if(ans<0)ans = 0;
    System.out.println(ans);
  }
}