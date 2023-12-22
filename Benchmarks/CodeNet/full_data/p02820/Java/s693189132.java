import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int r = in.nextInt();
        int s = in.nextInt();
        int p = in.nextInt();
        String t = in.next();
        StringBuilder t2 = new StringBuilder(t);
        long sum = 0;
        for(int i=0; i<n; i++) {
            char c = t.charAt(i);
            int currentPoint = r;
            if(c == 'p') {
                currentPoint = s;
            }
            else if(c == 'r') {
                currentPoint = p;
            }

            if(i >= k) {
                char prevC = t2.charAt(i-k);
                if(prevC == c) {
                    currentPoint = 0;
                    t2.replace(i, i+1, "n");
                }
            }
            sum += currentPoint;
        }
        System.out.println(sum);
    }
}
