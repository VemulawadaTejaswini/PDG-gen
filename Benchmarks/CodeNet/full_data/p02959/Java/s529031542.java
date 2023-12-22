import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] city = new int[num + 1];
        int[] brave = new int[num];
        for (int i = 0; i <= num; i++) {
            city[i] = Integer.parseInt(in.next());
        }
        for (int i = 0; i < num; i++) {
            brave[i] = Integer.parseInt(in.next());
        }
        long total = 0;
        int capa = 0;
        int capb = city[0];
        for (int i = 0; i < num; i++) {
            capa = capb;
            capb = city[i + 1];
            if (brave[i] <= capa) {
                total += brave[i];
                continue;
            } else {
                total += capa;
                int diff = brave[i] - capa;
                if (diff <= capb) {
                    capb -= diff;
                    total += diff;
                } else {
                    total += capb;
                    capb = 0;
                }
            }
        }
        System.out.println(total);
    }
}
