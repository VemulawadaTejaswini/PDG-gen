import java.util.Scanner;
import java.util.Arrays;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int p[];
    p = new int[N];
    int n = 0;

    for(int i = 0;i < N;i++){
      p[i] = sc.nextInt();
    }


    for(int i = 0;i < N;i++){
      if(p[i] != i+1){
        n++;
      }
    }

    if(n > 3){
      System.out.println("NO");
    }else{
      System.out.println("YES");
    }




  }
}
