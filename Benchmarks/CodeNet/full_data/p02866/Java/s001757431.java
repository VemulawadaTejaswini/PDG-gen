import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D[] = new int[N];
        int counter[] = new int[N];

        for(int i=0; i < N; i++) {
            D[i] = sc.nextInt();
            counter[D[i]]++;
            // System.out.println("c[" + D[i] + "]: " + counter[D[i]]);
        }

        if(D[0] != 0){                //D[0]が0以外の時、木は存在しない
            System.out.println(0);
        }else{
          long sum = 1;
          for(int i = 1; i < N; i++) {
              for(int j = 0; j < counter[i]; j++) {
                sum *= counter[i-1];
                sum %= 998244353L;
              }
          }
          System.out.println(sum);
        }
    }
}
