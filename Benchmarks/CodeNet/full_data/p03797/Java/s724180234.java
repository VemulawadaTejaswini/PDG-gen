

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int s,c;
        Scanner sc = new Scanner(System.in);
        s = sc.nextInt();
        c = sc.nextInt();
        sc.close();
        int counter = 0;
        if( 2 * s <= c)
        {
            counter += s;
            c -= 2 * s;
            counter += c / 4;
        }
        else
        {
            if(c % 2 == 1)
                c--;
            counter += c / 2;
        }
        System.out.println(counter);
    }
}
