import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int target = Integer.parseInt(sc.next());
        int bi = 100;
        for (int i = 0; i < n; i++) {
            bi *= 100; 
        }
        System.out.println((bi * target) / 100);
    }
}
