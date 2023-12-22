
public class Main {

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        int n = sc.nextInt();

        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (("" + i).length() % 2 == 1) {
                count++;
            }
        }

        System.out.println(count);

    }

}
