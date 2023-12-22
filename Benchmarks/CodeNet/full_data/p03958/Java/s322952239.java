import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int t = sc.nextInt();
        int ans = 0;
        int max = 0;
        for(int i = 0; i < t; i++){
            max = Math.max(max, sc.nextInt());
        }
        System.out.println(Math.max(0,max*2-1-k));
    }
}