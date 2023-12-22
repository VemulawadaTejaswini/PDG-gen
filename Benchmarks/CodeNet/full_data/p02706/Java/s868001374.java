import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,Integer> hash = new HashMap<>();
        int n = sc.nextInt();
        int m = sc.nextInt();
        long work = 0;
        for (int i=0;i<m;i++)work+=sc.nextInt();
        if (n<work)System.out.println(-1);
        else System.out.println(n-work);
    }
}
