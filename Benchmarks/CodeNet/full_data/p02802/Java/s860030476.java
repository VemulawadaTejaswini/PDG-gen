import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(m == 0) {
            System.out.println("0 0");
            return;
        }
        String[][] p = new String[m][2];
        for(int i=0; i<m; i++) {
            p[i][0] = sc.next();
            p[i][1] = sc.next();
        }
        boolean[] ac = new boolean[n+1];
        int [] wa = new int[n+1];
        for(int i=0; i<m; i++) {
            int a = Integer.parseInt(p[i][0]);
            if("AC".equals(p[i][1])) {
                ac[a] = true;
            } else if("WA".equals(p[i][1])) {
                if(ac[a] == false) {
                    wa[a]++;
                }
            }

        }
        int acC = 0;
        int waC = 0;
        for(int i=1; i<=n; i++) {
            if(ac[i] == true) acC++;
            waC += wa[i];
        }
        System.out.println(acC + " " + waC);
    }
}