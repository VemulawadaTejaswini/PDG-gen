import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String ans = null;
        int a[] = new int[4];

        String num = in.next();

        for(int x = 0; x < a.length; x++)
            a[x] = Integer.parseInt(String.valueOf(num.charAt(x)));

        if((a[0] + a[1] + a[2] + a[3]) == 7) ans = a[0] + "+" + a[1] + "+" + a[2] + "+" + a[3] + "=7";
        else if((a[0] - a[1] - a[2] - a[3]) == 7) ans = a[0] + "-" + a[1] + "-" + a[2] + "-" + a[3] + "=7";
        else if((a[0] + a[1] - a[2] - a[3]) == 7) ans = a[0] + "+" + a[1] + "-" + a[2] + "-" + a[3] + "=7";
        else if((a[0] + a[1] + a[2] - a[3]) == 7) ans = a[0] + "+" + a[1] + "+" + a[2] + "-" + a[3] + "=7";
        else if((a[0] + a[1] - a[2] + a[3]) == 7) ans = a[0] + "+" + a[1] + "-" + a[2] + "+" + a[3] + "=7";
        else if((a[0] - a[1] + a[2] - a[3]) == 7) ans = a[0] + "-" + a[1] + "+" + a[2] + "-" + a[3] + "=7";
        else if((a[0] - a[1] + a[2] + a[3]) == 7) ans = a[0] + "-" + a[1] + "+" + a[2] + "+" + a[3] + "=7";
        else if((a[0] - a[1] - a[2] + a[3]) == 7) ans = a[0] + "-" + a[1] + "-" + a[2] + "+" + a[3] + "=7";

        System.out.println(ans);
    }
}