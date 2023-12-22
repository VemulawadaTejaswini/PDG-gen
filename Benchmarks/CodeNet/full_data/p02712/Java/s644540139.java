import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int total = 0;
        for (int i = 0; i < N; i++) {
            if (!((i%3 == 0) || (i%5==0))) {
                total++;
            }
        }
        System.out.println(total);
    }
}