import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        String s = sc.next();

        boolean[] ACarr = new boolean[N];
        for (int i = 0; i < N; i++) {
            char c = s.charAt(i);
            if(i+1 < N || c=='A'){
                char c2 = s.charAt(i+1);
                if(c2 == 'C'){
                    ACarr[i] = true;
                }
            }
        }


        int[][] lr = new int[Q][2];
        for (int i = 0; i < Q; i++) {
            int l  = sc.nextInt();
            int r  = sc.nextInt();
            int count = 0;
            for (int j = l-1; j < r -1; j++) {
                if(ACarr[j]){
                    count++;
                }
            }
            System.out.println(count);
        }

    }
}