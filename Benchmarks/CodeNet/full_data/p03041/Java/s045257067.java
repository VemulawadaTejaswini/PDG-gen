import java.util.Scanner;

public class Main {

    public static void main( String[] args ){

        Scanner in = new Scanner(System.in);

        String param = in.nextLine();
        String[] params = param.split( " ");

        int n = Integer.parseInt( params[0]);
        int k = Integer.parseInt( params[1]);
        String s = in.nextLine();

        String[] chars = s.split("");
        String ans = "";
        for( int i = 0 ; i < chars.length ; i++ ){
            if( i == k - 1 ){
                ans += chars[i].toLowerCase();
            }
            else {
                ans += chars[i];
            }
        }
        System.out.println(ans);
    }
}