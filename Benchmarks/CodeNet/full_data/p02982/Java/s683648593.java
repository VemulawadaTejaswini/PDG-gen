import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int d = stdIn.nextInt();
        int x[][] = new int[n][d];

        for(int i = 0;i < n;i++) {
            for(int j = 0;j < d;j++) {
                x[i][j] = stdIn.nextInt();
            }
        }

        int count = 0;
        for(int i = 0;i < n;i++) {
            for(int j = i + 1;j < n;j++) {
                 double r = 0;
                 for(int k = 0;k < d;k++) {
                     r += (x[i][k] - x[j][k]) * (x[i][k] - x[j][k]);
                 }
                 r = Math.sqrt(r);
                 if(r == (int)r) {
                     count++;
                 }
            }
        }

        System.out.println(count);
        
        
    }
}

