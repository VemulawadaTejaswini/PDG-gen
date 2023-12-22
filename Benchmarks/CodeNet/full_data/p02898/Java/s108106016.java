import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String[] params = in.nextLine().split(" ");
        int n = Integer.parseInt(params[0]);
        int k = Integer.parseInt(params[1]);
        params = in.nextLine().split(" ");
        int count = 0;
        for( int i = 0 ; i < n ; i++ ){
            int h = Integer.parseInt(params[i]);
            if( k <= h ){
                count++;
            }
        }

        System.out.println(count);

    }

}
