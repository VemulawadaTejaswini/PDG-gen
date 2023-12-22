import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String[] params = in.nextLine().split(" ");
        int[] hs = new int[n];
        for( int i = 0 ; i < n ; i++ ){
            hs[i] = Integer.parseInt( params[i]);
        }

        int min = hs[0];
        boolean flag = true;
        for( int i = 0 ; i < n - 1 ; i++ ){
            if( hs[i] <= hs[i + 1 ]){
                min = hs[i];
            }
            else if( hs[i] > hs[i + 1 ]){
                if( min < hs[i] ){
                    if( hs[i] - 1 == hs[i + 1 ]) {
                        min = hs[i] - 1;
                    }
                    else {
                        flag = false;
                        break;
                    }
                }
                else {
                    flag = false;
                    break;
                }
            }
        }

        System.out.println( flag ? "Yes" : "No" );

    }

}
