import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        boolean[] ac = new boolean[n];
        int[] wa = new int[n];
        for(int i=0; i<n; i++) {
            ac[i] = false;
            wa[i] = 0;
        }
        for(int i=0; i<m; i++) {
            int p = in.nextInt()-1;
            boolean isAC = (in.next().equals("AC"));
            if(ac[p]) {
                // 既にAC
                continue;
            }
            if(isAC) {
                ac[p] = true;
            }
            else {
                wa[p]++;
            }
        }
        int account = 0;
        int wacount = 0;
        for(int i=0; i<n; i++) {
            if(ac[i]) {
                account++;
                wacount += wa[i];
            }
        }
        System.out.print(account);
        System.out.print(' ');
        System.out.println(wacount);
    }
}
