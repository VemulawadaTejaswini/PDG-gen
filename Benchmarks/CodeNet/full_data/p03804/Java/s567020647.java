import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();


        String[] A = new String[ N ];
        for(int i = 0 ;i < N ; i ++){
            A[ i ] = sc.next();
        }

        String[] B = new String[ M ];
        for(int i = 0 ;i < M ; i ++){
            B[ i ] = sc.next();
        }

        boolean[][] matchFlg = new boolean [ N - M + 1 ][ N - M + 1 ];

        for(int i = 0 ;i < N - M + 1 ; i ++){
            for(int j = 0 ; j < M - 1 ; j ++){
                if(i == 0){

                    matchFlg[i][j] = B[i].equals( A[i].substring( j , j + M ) );
                }else{
                    if(matchFlg[ i - 1 ][ j ]){
                        matchFlg[i][j] = B[i].equals( A[i].substring( j , j + M ) );
                    }
                }
            }
        }

        boolean result = false ;
        for(int j = 0 ; j < N - M + 1 ;j ++){
            if(matchFlg[ N - M ][ j ]){
                result = true;
                break;
            }
        }

        System.out.println(result ? "Yes" : "No");
    }
}
