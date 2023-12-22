import java.util.*;

public class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char c1[] = sc.next().toCharArray();
        char c2[]=sc.next().toCharArray();
        if(c1[0]==c2[2]&&c1[1]==c2[1]&&c1[2]==c2[0]) System.out.println("YES");
        else System.out.println("NO");


    }
}
