import java.util.Scanner;

public class Main {


    private static boolean check( int[] as , int n){
        for (int i = 0; i < n; i++) {
            if( as[i] == ((i == 0 ? as[n - 1] : as[i - 1]) ^ (i == n - 1 ? as[0] : as[i + 1])) ){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt( in.nextLine() );
        String[] params = in.nextLine().split(" ");
        int[] as = new int[n];
        int oddCount = 0;
        for( int i = 0 ; i < n ; i++ ){
            as[i] = Integer.parseInt(params[i]);
            oddCount++;
        }

        if( oddCount % 2 != 0 ){
            System.out.println("No");
            return;
        }

        if( check( as , n ) ){
            System.out.println("Yes");
            return;
        }



        System.out.println("No");

    }

}