import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        List<Integer> h = new ArrayList();

        for (int i = 0; i<N;i++){
            h.add(input.nextInt());
        }
        long answer = 0;
        for (int i = 0; i < N-1;i++){
            for (int j = i + 1; j < N; j++){
                answer += h.get(i) * h.get(j);
            }
        }

        System.out.println(answer);

    }
}