import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int N = sc.nextInt();
    int cnt = 0;
    for(int i = 1;i <= N;i++){
      if(sc.nextInt() == i){
        cnt++;
        i++;
        sc.nextInt();
      }else if(i == N -1){
        i++;
        if(sc.nextInt() == i) {
          cnt++;
        }
      }
    }
    System.out.println(cnt);
  }
}
        
