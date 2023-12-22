import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = sc.next().split("");
        int minPeople = 0;
        for (int i = 1; i < n; i++) {
            if ("E".equals(s[i])) {
                minPeople++;
            }
        }

        int beforeCount = minPeople;
        for (int i = 1; i < n; i++) {
            int count = beforeCount;
            if ("W".equals(s[i - 1])) {
                count++;
            }
            if ("E".equals(s[i])) {
                count--;
            }
            beforeCount = count;
            if (count < minPeople) {
                minPeople = count;
            }
        }
        System.out.println(minPeople);
    }

}
