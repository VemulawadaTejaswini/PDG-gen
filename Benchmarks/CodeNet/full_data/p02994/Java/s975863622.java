import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        sc.close();

        int[] appleAziArray = IntStream.rangeClosed(L, L + N - 1).toArray();

        int taberuAppleNoZettaiAzi = Arrays.stream(appleAziArray)
                .map(i -> {
                    if (i > 0)
                        return i;
                    else
                        return -i;
                })
                .min().orElse(0);

        int motomeruAzi = Arrays.stream(appleAziArray)
                .filter(i -> i != taberuAppleNoZettaiAzi)
                .filter(i -> i != -taberuAppleNoZettaiAzi)
                .sum();

        System.out.println(motomeruAzi);

    }
}
