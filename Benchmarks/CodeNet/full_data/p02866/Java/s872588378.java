import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    int[] D = new int[N];
    String next = sc.nextLine();
    String[] Ds = next.split(" ");
    for(int i = 0; i < N; i++) {     
      D[i] = 0;
    }
    //1は距離ゼロでなければならない
    if(!Ds[0].equals("0")) {
      System.out.println(0);
      return;
    }
    for(int i = 0; i < N; i++) {
      int a = Integer.parseInt(Ds[i]);
      if(a == N) { //Nにはたどり着けない
        System.out.println(0);
        return;
      }
      D[a] ++;
    }
    //D[0]は必ず1でなければならない
    if(D[0] != 1) {
      System.out.println(0);
      return;
    }
    int sum = 1;
    boolean flag = false;
    for(int i = N - 1; i >= 1; i--) {   
      if(D[i] == 0 && flag) {
        sum = 0;
      }
      if(D[i] != 0 && !flag) {
        flag = true;
      }
      sum *= (int) Math.pow(D[i - 1], D[i]);
    }
    System.out.println(sum);
  }
}