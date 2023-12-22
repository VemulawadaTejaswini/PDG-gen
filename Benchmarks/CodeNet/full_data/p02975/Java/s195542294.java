import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num  = sc.nextInt();
        for(int i = 1; i < n; i++) {
            num ^= sc.nextInt();
        }
        if(num == 0) System.out.println("Yes");
        else System.out.println("No");
    }
}
