import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        String s = sc.next();
       int[][] tbl = new int[N][N];
        for (int i = 0; i < N; i++) {
            char c = s.charAt(i);
            if( c=='C' && (i-1)  >=0 ){
                char c2 = s.charAt(i-1);
                if(c2 == 'A'){
                    for (int j = 0; j < i ; j++) {
                        tbl[j][i] =tbl[j][i-1] +1 ;
                    }
                    continue;
                }
            }
            for (int j = 0; j < i ; j++) {
                tbl[j][i] =tbl[j][i-1]  ;
            }
        }


        for (int i = 0; i < Q; i++) {
            int l  = sc.nextInt()-1;
            int r  = sc.nextInt()-1;
            System.out.println(tbl[l][r]);
        }

    }
}