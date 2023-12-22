import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), l = sc.nextInt();
        String[] s = new String[n];

        for (int i = 0; i < n; i++)s[i]=sc.next();

        Arrays.sort(s);
        String ans=s[0];
        for(int i=1;i<n;i++)ans += s[i];
        System.out.println(ans);
    }
}
