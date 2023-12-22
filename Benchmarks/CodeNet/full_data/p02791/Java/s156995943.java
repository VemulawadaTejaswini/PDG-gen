import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = Long.parseLong(sc.nextLine());
        String[] arrays = sc.nextLine().split(" ");
        sc.close();

        int count = 0;
        long tmpMax = Long.parseLong(arrays[0]);

        for (int i = 0; i < N; i++) {
            long Pi = Long.parseLong(arrays[i]);
            if (tmpMax >= Pi) {
                count++;
                tmpMax = Pi;
            } else {
                continue;
            }
        }

        System.out.println(count);

    }

}