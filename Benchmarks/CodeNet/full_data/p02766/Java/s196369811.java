import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();
        int count = 0;
        String bin = Integer.toBinaryString(N);
        int strint = Integer.parseInt(bin);
        while(strint != 0) {
            strint /= 10;
            ++count;
        }
        System.out.println(count);
    }
}
