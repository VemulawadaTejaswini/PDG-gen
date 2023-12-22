import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long ans = 0;
        int n = sc.nextInt();
        Set<String> set = new HashSet<>();
        for(int i = 0; i < n; i++) {
            char[] ca = sc.next().toCharArray();
            Arrays.sort(ca);
            if(set.contains(String.valueOf(ca))) ans++;
            else set.add(String.valueOf(ca));
        }
        System.out.println(ans);
    }
}
