import java.util.Arrays;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String t = scan.next();
        scan.close();
        char[] sa = s.toCharArray();
        char[] ta = t.toCharArray();
        Arrays.sort(sa);
        Arrays.sort(ta);
        int compared_time = 0;
        for (int i = 0; i < Math.min(sa.length, ta.length); i++)
        {
            char sc = sa[i], tc = ta[i];
            if (sc > tc)
                break;
            compared_time++;
        }
        if (compared_time == Math.min(sa.length, ta.length))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
