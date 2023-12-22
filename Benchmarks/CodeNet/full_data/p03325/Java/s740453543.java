import java.util.*;


public class Main {
    static int answer;
    static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.nextLine());
        String[] str = sc.nextLine().split("[\\s]+");
        int[] inputs = new int[N];
        answer = 0;

        for(int i = 0; i < N; i++) {
          inputs[i] = Integer.parseInt(str[i]);
        }
        hoge(inputs,0);
        System.out.println(answer);
    }

    public static void hoge(int[] inputs,int count) {
      int[] w = new int[N];
      boolean check = true;
      for(int i =0; i < N; i++) {
        w[i] = inputs[i] * 3;
      }
      for(int i = 0; i < N; i++) {
        if(inputs[i] % 2 == 0) {
          check = false;
          w[i] = inputs[i] / 2;
          hoge(w,count+1);
          return;
        }
      }
      if(check && answer < count) {
        answer = count;
      }
    }
}
