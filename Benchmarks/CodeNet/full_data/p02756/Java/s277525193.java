import java.util.*;

public class Main {

    static final int MOD=1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] str = new char[10000000];
        int l = 5000000;
        int r = l-1;
        for(int i=0;i<str.length;i++)str[i]='@';
        char[] s = sc.next().toCharArray();

        for(int i=0;i<s.length;i++){
            str[r+1]=s[i];
            r++;
        }
        int q = sc.nextInt();

        for(int i=0;i<q;i++) {
            int t = sc.nextInt();
            if (t == 1) {
                char temp = str[l];
                str[l] = str[r];
                str[r] = temp;
            } else {
                int f = sc.nextInt();
                char c = sc.next().charAt(0);
                if (f == 1) {
                    l--;
                    str[l] = c;
                } else {
                    r++;
                    str[r] = c;
                }
            }
        }

        for(int i=l;i<r+1;i++){
            System.out.print(str[i]);
        }
        System.out.println();


    }
}


