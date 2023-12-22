import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int R = sc.nextInt();
        int S = sc.nextInt();
        int P = sc.nextInt();
        String T = sc.next();

        int ans = 0;
        T = T.replace("r","P").replace("p","S").replace("s","R");
        System.out.println(T);

        for(int i=0; i<T.length(); i++) {

            if(T.charAt(i) == 'R'){
                if(i >= K && T.charAt(i - K) == 'R') 
                    continue;
                ans += R;
            } 
            else if(T.charAt(i) == 'S') {
                if(i >= K && T.charAt(i - K) == 'S') 
                    continue;
                ans += S;
            } 
            else if(T.charAt(i) == 'P') {
                if(i >= K && T.charAt(i - K) == 'P') 
                    continue;
                ans += P;
            }
        }

        System.out.println(ans);
    }
}