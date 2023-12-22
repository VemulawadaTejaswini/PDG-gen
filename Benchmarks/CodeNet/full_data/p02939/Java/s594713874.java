import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] ss = s.split("");
        int ans = 1;
        for( int i = 0  ; i < s.length() - 1; i++ , ans++ ) {
            if (ss[i].equals(ss[i + 1])) {
                i++;
            }
        }
        System.out.println( ans );

    }

}
