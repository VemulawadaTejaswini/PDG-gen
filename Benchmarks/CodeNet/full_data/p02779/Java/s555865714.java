import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main  {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List list = new ArrayList<Integer>(n);
        boolean flag = false;
        while (n > 0 ) {
            int val = sc.nextInt();
            if(list.contains( val))
                flag = true;
            list.add( val );
             n--;
        }
        if(flag)
            System.out.println( "NO");
        else
            System.out.println("YES");

    }
}
