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
        if(W1<x)W1 = x;
      }else if(a==2){
        if(W2>x)W2 = x;
      }else if(a==3){
        if(H1<y)H1 = y;
      }else{
        if(H2>y)H2 = y;
      }
    }
    int ans = (W2-W1)*(H2-H1);
    if((W2-W1)<0 || (H2-H1)<0){
      ans = 0;
    }
    System.out.println(ans);
  }
}