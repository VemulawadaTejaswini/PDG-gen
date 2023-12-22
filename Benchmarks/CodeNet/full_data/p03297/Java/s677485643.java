import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        FOR:
        for (int t = 0; t < T; t++) {
            long As = scanner.nextLong();
            long Bs = scanner.nextLong();
            long Cs = scanner.nextLong();
            long Ds = scanner.nextLong();
            List<Long> remains = new ArrayList<>();
            int count = 0;
            while (As >= Bs) {
          
                long temp = (Bs * (As / Bs + Cs / Bs));
                int i = 0;
                while (temp > As) {
                    i++;
                    temp = (Bs * (As / Bs + Cs / Bs - i));
                }
                As -= (temp <= As ? temp : Bs);
          
                if (As <= Cs) {
                    As += Ds;
                }

                if (remains.contains(As)) {
                    System.out.println("Yes");
                    continue FOR;
                } else {
                    remains.add(As);
                }
                count++;
                if (count>100000) {
                    System.out.println("No");
                  continue FOR;
                }
            }
            System.out.println("No");
        }
    }
}