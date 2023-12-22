import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        ArrayList<Sushi<Long, Long>> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int shurui = sc.nextInt();
            int umami = sc.nextInt();

            list.add(new Sushi<Long, Long>(shurui, umami));
        }

        sc.close();

        list.sort(Comparator.comparing(Sushi::getUmami, Comparator.reverseOrder()));

        long ans = 0;
        long umamiSum = 0;
        long shuruiSum = 0;
        long tmp = 0;

        for (int i = 0; i < K; i++) {
            long umami = list.get(i).getUmami();
            long shurui = list.get(i).getShurui();

            umamiSum += umami;
            if (shurui != tmp) {
                shuruiSum++;
                tmp = shurui;
            }
        }

        ans = umamiSum + (shuruiSum * shuruiSum);

        System.out.println(ans);
    }

    public static class Sushi<shurui, umami> {
        public long shurui;
        public long umami;

        public Sushi(long shurui, long umami) {
            this.shurui = shurui;
            this.umami = umami;
        }

        public long getShurui() {
            return shurui;
        }

        public long getUmami() {
            return umami;
        }
    }
}