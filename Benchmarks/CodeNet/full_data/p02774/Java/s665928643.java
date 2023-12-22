import java.util.Objects;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();
        sc.close();

        int N = Integer.parseInt(line1.split(" ")[0]);
        int K = Integer.parseInt(line1.split(" ")[1]);
        Long[] aArray = Arrays.stream(line2.split(" ")).map(Long::parseLong).toArray(Long[]::new);
        Long[] timeArray = new Long[N * (N - 1) / 2];
        int timeArrayCount = 0;

        for (int i = 0; i < N; i++) {
            Long val1 = aArray[i];
            Long[] argArray = aArray.clone();
            for (int l = 0; l <= i; l++) {
                argArray[l] = null;
            }
            for (Long val2 : argArray) {
                if (Objects.isNull(val2)) {
                    continue;
                }
                timeArray[timeArrayCount] = val1 * val2;
                timeArrayCount++;
            }
        }

        Arrays.sort(timeArray);

        System.out.println(timeArray[K-1]);
    }

}