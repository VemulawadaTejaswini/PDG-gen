import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int sum = 0;
        int num = 0;
        for(int i = 0; i <= A; i++) {
            sum += i;
        }
        for(int i = 0; i <= B; i++) {
            num += i;
        }
        System.out.println(num / sum);
    }
}