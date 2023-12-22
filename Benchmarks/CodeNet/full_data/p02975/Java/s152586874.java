import java.util.Scanner;

public class Main {


    private static boolean check( int[] as , int n){
        for (int i = 0; i < n; i++) {
            int left = i == 0 ? as[n - 1] : as[i - 1];
            int center = as[i];
            int right = i == n - 1 ? as[0] : as[i + 1];
            if( center != (left ^ right) ){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt( in.nextLine() );
        String[] params = in.nextLine().split(" ");
        int[] as = new int[n];
        int oddCount = 0;
        for( int i = 0 ; i < n ; i++ ){
            as[i] = Integer.parseInt(params[i]);
            if( as[i] % 2 != 0 ){
                oddCount++;
            }
        }

//        if( oddCount % 2 != 0 ){
//            System.out.println("No");
//            return;
//        }

        if( check( as , n ) ){
            System.out.println("Yes");
            return;
        }



        System.out.println("No");

    }

}