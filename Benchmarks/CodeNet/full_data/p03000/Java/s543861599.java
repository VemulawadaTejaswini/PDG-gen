import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int X = sc.nextInt();
    int ans = 1;
    int loop = 0;
    for (int i=0;i<N;i++){
      loop += sc.nextInt();
      if (loop > X){
        break;
      }else{
        ans++;
      }
    }
    System.out.println(ans);
  }
}