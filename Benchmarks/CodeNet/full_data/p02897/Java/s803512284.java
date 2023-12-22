import java.util.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
         int n = sc.nextInt();
         int even = n/2;
         double odd = n-even;
         System.out.println(odd/n);
    }
}
