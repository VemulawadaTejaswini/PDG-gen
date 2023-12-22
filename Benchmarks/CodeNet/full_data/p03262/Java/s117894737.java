import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amntcity = scanner.nextInt();
        int syokiiti = scanner.nextInt();
        int[] cities = new int[amntcity + 1];
        for (int i = 0; i < amntcity; i++) {
            cities[i] = scanner.nextInt();

        }
        cities[cities.length - 1] = syokiiti;
        Arrays.sort(cities);

        int[] sa = new int[amntcity];
        for (int i = 0; i < sa.length; i++) {
            sa[i] = cities[i + 1] - cities[i];
        }
        Arrays.sort(sa);

        int d = 1;
        for (int i = 1; i <= sa[0]; i++) {
            boolean is = true;
            for (int j = 0; j < sa.length; j++) {
                if (sa[j] % i != 0) {
                    is = false;
                    break;
                }
            }
            if (is) {
                d = i;
            }
        }
        System.out.println(d);

    }
}
