import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] in = s.nextLine().split(" ");
        int a = Integer.parseInt(in[0]);
        int p = Integer.parseInt(in[1]);
        System.out.println((a*3+p)/2);
    }
}