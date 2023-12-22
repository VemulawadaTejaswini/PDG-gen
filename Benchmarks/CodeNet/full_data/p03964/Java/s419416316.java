import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int r = 1;
        int l = 1;
        for(int i=0; i<N; i++){
            int T = sc.nextInt();
            int A = sc.nextInt();
            int x = (int)Math.ceil((double)r/T);
            int y = (int)Math.ceil((double)l/A);
            int k = Math.max(x,y);
            r=k*T;
            l=k*A;
        }
        System.out.println(r+l);
    }
}