import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        int count = 1;
        long min = sc.nextLong();
        for (int i = 1; i < n; i++) {
            long num = sc.nextLong();
            if(min >= num) {
                min = num;
                count++;
            }
        }
        System.out.println(count);
    }
}
