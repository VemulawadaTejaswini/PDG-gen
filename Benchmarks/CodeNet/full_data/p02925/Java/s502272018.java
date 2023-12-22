import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        int N;
        int[][] A;

        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            A = new int[N][N - 1];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N - 1; j++) {
                    A[i][j] = sc.nextInt();
                }
            }
        }
        long result = 0;
        Deque<Integer>[] list = new Deque[N];
        for (int i = 0; i < N; i++) {
            Deque<Integer> target = new ArrayDeque<>(N);
            list[i] = target;
            for (int j = 0; j < N - 1; j++) {
                target.add(A[i][j]);
            }
        }
        Integer[] nextCallenge = new Integer[N];
        for (int i = 0; i < N; i++) {
            nextCallenge[i] =  list[i].poll();
        }

        long game = 0;
        long maxGame = (N * (N - 1)) / 2;

        long days = 1;
        while (true) {
            //System.out.println("Days"+days);
            //初期化
            boolean[] arr = new boolean[N];

            //とある日の組み合わせ
            int cnt = 0;
            for (int i = 0; i < N; i++) {
                int hito1;
                int hito2;
                int counter = i;
                if(arr[counter]){
                    continue;
                }
                while (true) {
                    if(arr[counter]){
                        break;
                    }

                    arr[counter] = true;
                    if(nextCallenge[counter] == null){
                        break;
                    }
                    int a = nextCallenge[counter];
                    if(arr[a - 1]){
                        break;
                    }

                    if (nextCallenge[a - 1] == counter+1) {
                        arr[a - 1] = true;
                        hito1 = counter;
                        hito2 =a-1;
                        //System.out.println((hito1+1)+":" +(hito2+1) );
                        nextCallenge[hito1] = list[hito1].poll();
                        nextCallenge[hito2] = list[hito2].poll();
                        cnt++;
                        game++;
                        break;
                    }else{
                        counter = a-1;
                    }
                }
            }

            if (maxGame == game) {
                System.out.println(days);
                break;
            }
            if (cnt == 0) {
                System.out.println(-1);
                break;
            }
            days++;
        }
    }

}
