import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextInt();
        long r = sc.nextInt();
        long min = 10000;
        for(long L = l; L < l + 2019; L++){
            for(long R = L + 1;  R <= r && R < L + 2020; R++){
              min = Math.min(((L % 2019) * (R % 2019)) % 2019, min);
            }
        }
        System.out.println(min);
    }
}
