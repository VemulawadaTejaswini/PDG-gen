import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long N = sc.nextLong();
        long[] capa = new long[5];
        for (int i = 0; i < 5; i++) {
            capa[i] = sc.nextLong();
        }

        long[] city = new long[]{N, 0, 0, 0, 0, 0};
        long result = 0;
        while(city[5] != N) {
            for (int i = 4; i > -1; i--) {
                if (city[i] < capa[i]) {
                    city[i+1] += city[i];
                    city[i] = 0;
                } else {
                    city[i+1] += capa[i];
                    city[i] -= capa[i];
                }
            }
            result++;
        }
        System.out.println(result);
    }
}