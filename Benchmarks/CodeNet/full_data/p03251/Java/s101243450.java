import java.util.Scanner;
class abc110b {
    public static void main(String args[]) {
        Scanner stdIn = new Scanner(System.in);
        int n, m, xcap, ycap;
        n = stdIn.nextInt();
        m = stdIn.nextInt();
        xcap = stdIn.nextInt();
        ycap = stdIn.nextInt();

        int i;
        int x[] = new int[n];
        for(i=0; i<n; i++) {
            x[i] = stdIn.nextInt();
        }

        int j;
        int y[] = new int[m];
        for(j=0; j<m; j++) {
            y[j] = stdIn.nextInt();
        }

        if(xcap > ycap) {
            System.out.println("War");
            return;
        }
        for(i=0; i<n; i++) {
            for(j=0; j<m; j++) {
                if(x[i] > y[j]) {
                    System.out.println("War");
                    return;
                }
            }
        }

        System.out.println("No war");
    }
}
