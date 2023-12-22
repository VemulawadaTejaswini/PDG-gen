import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] s = new int[M];
    int[] c = new int[M];
    for (int i = 0; i < M; i++) {
      s[i] = sc.nextInt();
      c[i] = sc.nextInt();
    }
    int count = 0;
    int min =0;
    if(N == 3){
      min = 100;
      count = 999;
    }else if(N == 2){
      min = 10;
      count = 99;
    }else if(N == 1){
      min = 1;
      count = 9;
    }else{
      count = 0;
    }
    int cnt = 0;
    for(int j = min; j <= count; j++){

      for(int k =0; k < M; k++){
        if(s[k]==N){
          if(j%10 == c[k]){
            cnt++;
          }
        }else{
          if((j /(int)Math.pow(10,(N -s[k]))) == c[k]){
          cnt++;
          }
        }
      }
      if(cnt == M){
        System.out.println(j) ;
        return;
      }else{
      cnt = 0;
      }
    }
    System.out.println(-1) ;
  }
}

