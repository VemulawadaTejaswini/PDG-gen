import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n+1];
        for(int i=1; i<=n; i++) {
            p[i] = sc.nextInt();
        }
        int count = 0;
        for(int i=1; i<=n; i++) {
            if(p[i] != i) {
                for(int j=i+1; j<=n; j++) {
                    if(p[j] == i) {
                        p[j] = p[i];
                        p[i] = i;
                        count++;
                        if(count >= 2) {
                            System.out.println("NO");
                            return;
                        }
                    }
                }
            }
        }
        System.out.println("YES");
    }
}