import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int flg = 0;
    if(N == 1 && M == 0){
        System.out.println("0");
        flg = 1;
    }
    int[] n = new int[N];
    int[] flg = new int[N];
    for(int i = 0; i < M; i++){
      int s = sc.nextInt();
      int c = sc.nextInt();
      if(N == 1 && M == 1){
        System.out.println(c);
        flg = 1;
        break;
      } else if(s == 1 && c == 0){
        System.out.println("-1");
        flg = 1;
        break;
      } else if(n[s - 1] == 0 || n[s - 1] == c || flg[s - 1] == 0){
        n[s - 1] = c;
        flg[s - 1] = 1;
      } else {
        System.out.println("-1");
        flg = 1;
        break;
      }
    }
    if(N != 1 && n[0] == 0){
      n[0] = 1;
    }
    if(flg == 0){
      for(int i = 0; i < N; i++){
        System.out.print(n[i]);
      }
    }
  }
}
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int flg = 0;
    if(N == 1 && M == 0){
        System.out.println("0");
        flg = 1;
    }
    int[] n = new int[N];
    int[] flg2 = new int[N];
    for(int i = 0; i < M; i++){
      int s = sc.nextInt();
      int c = sc.nextInt();
      if(N == 1 && M == 1){
        System.out.println(c);
        flg = 1;
        break;
      } else if(s == 1 && c == 0){
        System.out.println("-1");
        flg = 1;
        break;
      } else if(n[s - 1] == 0 || n[s - 1] == c || flg2[s - 1] == 0){
        n[s - 1] = c;
        flg2[s - 1] = 1;
      } else {
        System.out.println("-1");
        flg = 1;
        break;
      }
    }
    if(N != 1 && n[0] == 0){
      n[0] = 1;
    }
    if(flg == 0){
      for(int i = 0; i < N; i++){
        System.out.print(n[i]);
      }
    }
  }
}
