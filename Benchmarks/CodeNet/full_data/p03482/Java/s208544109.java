import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte[] s = scan.next().getBytes();
        int sum = 0;
        for(byte tmp : s) {
            sum += tmp - '0';
        }
        System.out.println(Math.max(sum, s.length -sum));
    }
}
