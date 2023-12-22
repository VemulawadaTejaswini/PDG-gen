import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int l = scan.nextInt();
        int out = 0;
        for(int i = 2; i <= n; i++){
            out += l + i - 1;
        }
        System.out.println(out);
    }
}