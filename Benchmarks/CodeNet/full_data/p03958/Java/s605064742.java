import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int t = sc.nextInt();
        int a = 0;
        for (int i=0;i<t;i++)a=Math.max(sc.nextInt(),a);
        System.out.println(Math.max(0,a*2-k-1));
    }
}
