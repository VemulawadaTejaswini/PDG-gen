import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[][] x = new int[n][d];
        for(int a=0; a<n; a++) {
            for(int b=0; b<d; b++) {
                x[a][b] = in.nextInt();
            }
        }
        int c = 0;
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(isInt(x[i], x[j])) {
                    c++;
                }
            }
        }
        System.out.println(c);
    }
    private static boolean isInt(int[] pi, int[] pj) {
        int dist = 0;
        for(int d=0; d<pi.length; d++) {
            dist += Math.pow(pj[d]-pi[d], 2);
        }
        int sqrt = (int)Math.round(Math.sqrt(dist));
        return dist == sqrt * sqrt;
    }
}
