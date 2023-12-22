import java.util.*;


public class Main {
    static int answer;
    static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.nextLine());
        String[] str = sc.nextLine().split("[\\s]+");
        int[] inputs = new int[N];
        int count = 0;
        for(int i = 0; i < N ; i++) {
          inputs[i] =Integer.parseInt(str[i]);
        }

        for(int i = 0; i < N; i++) {
          count += hoge(inputs[i],0);
        }

        System.out.println(count);
    }

    public static int hoge(int x,int count) {
      if(x % 2 == 0) {
        return hoge(x/2,count + 1);
      }
      return count;
    }
}
