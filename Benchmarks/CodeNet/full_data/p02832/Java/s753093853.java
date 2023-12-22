import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int cur = 0;
        for(int i=0; i<n; i++) {
            int a = in.nextInt();
            if(a == cur + 1) {
                cur = a;
            }
        }
        System.out.println(cur==0?-1:(n-cur));
    }
}
