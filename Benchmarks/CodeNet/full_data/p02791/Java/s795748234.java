import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] p = new int[n];
        for(int i = 0;i < n;i++) {
            p[i] = in.nextInt();
        }
        int minZ = p[0], cnt = 1;
        for(int i = 1;i < n;i++) {
            if(minZ >= p[i]) {
                minZ = p[i];
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}