import java.util.HashSet;
import java.util.Scanner;

public class Main  {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> hashSet = new HashSet<>();
        while (n > 0 ) {
            int val = sc.nextInt();
            if(hashSet.contains( val)) {
                System.out.println( "NO");
                return;
            }
            hashSet.add( val );
             n--;
        }

            System.out.println("YES");

    }
}
