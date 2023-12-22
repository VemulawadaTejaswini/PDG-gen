import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] ARRAY = new int[N];

        for (int i = 0; i < N; i++) {
            ARRAY[i] = scanner.nextInt();
        }

        int[] ballArray = new int[N];
        for (int i = N; i > 0; i--) {
            int bairitu = 2;
            int count= 0;
            while ((i * bairitu) <= N) {
                if (ballArray[i * bairitu - 1] == 1) {
                    count++;
                }
                bairitu++;
            }

            if (ARRAY[i-1] == 1) {
                if (count % 2 == 0) {
                    ballArray[i-1] = 1;
                }
            } else {
                if (count % 2 == 1) {
                    ballArray[i-1] = 1;
                }
            }
        }

        List<Integer> resultList = new ArrayList<>();
        for (int i=0; i<N; i++) {
            if (ballArray[i] == 1) {
                resultList.add(i+1);
            }
        }

        StringBuilder sb = new StringBuilder();
        System.out.println(resultList.size());
        for (Integer result : resultList) {
            sb.append(result).append(" ");
        }
        System.out.println(sb.toString());
    }
}