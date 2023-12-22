import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int AB = sc.nextInt();
        int BC = sc.nextInt();
        int CA = sc.nextInt();
        int min = AB;
        int ans = 1;

        min = Math.min(AB, BC);

        ans *= min;

        min = Math.min(BC, CA);

        ans *= min;
        System.out.println(ans/2);
    }
}