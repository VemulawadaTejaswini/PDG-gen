import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int W = sc.nextInt();
        int H = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println((W*H) / 2);
        if (((W/x) == 2) && ((H/y) == 2))
            System.out.println(1);
        else
            System.out.println(0);
        sc.close();
    }
}