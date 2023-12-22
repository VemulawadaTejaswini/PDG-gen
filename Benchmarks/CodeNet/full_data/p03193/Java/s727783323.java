import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int H = sc.nextInt();
    int W = sc.nextInt();
    int ans = 0;
    for(int i=0; i<N; i++){
      int tmpH = sc.nextInt();
      int tmpW = sc.nextInt();
      if(H-tmpH >= 0 && W-tmpW >= 0){
        ans++;
      }
    }
    System.out.print(ans);
  }
}
        