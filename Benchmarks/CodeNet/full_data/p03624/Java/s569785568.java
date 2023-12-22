import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        for (int i = 0; i < 26; i++) {
            if (S.indexOf('a' + i) == -1) {
                System.out.println((char) ('a' + i));
                return;
            }
        }
        System.out.println("None");
    }
}
