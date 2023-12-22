import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int N = sc.nextInt();
        int Q = sc.nextInt();
        String S = sc.next();

        int  [] list = new int [N + 1]; 
        int cnt = 0;
        
        for (int i = 0; i < N - 1; i++) {
            if ( S.substring(i, i + 2).equals("AC") ) cnt++;
            list[i + 2] = cnt; 
        }

        for (int q = 0; q < Q; q++ ) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = list[r] - list[l];

            System.out.println( ans ); 
        }
    }
}