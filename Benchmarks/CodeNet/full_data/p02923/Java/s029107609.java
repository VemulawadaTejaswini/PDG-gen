import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] m = new int[n];
        for(int i = 0;i < n;i++){
            m[i] = sc.nextInt();
        }

        int count = 0;
        int ans = 0;
        for(int i = 1;i < n;i++){
            if(m[i-1] >= m[i]){
                count++;
            } else {
                ans = Math.max(ans, count);
                count = 0;
            }
        }

        System.out.println(count);
    }
}