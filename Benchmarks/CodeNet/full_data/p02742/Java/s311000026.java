import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long H = sc.nextInt();
        long W = sc.nextInt();
        if (H==1 || W==1) System.out.println(1);
        else System.out.println(H*W/2+H*W%2);
    }
}