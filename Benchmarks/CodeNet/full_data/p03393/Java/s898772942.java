import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        if("zyxwvutsrqponmlkjihgfedcba".equals(S)){
            System.out.println("-1");
            return;
        }
        int tmp = 0;
        String ans = null;
        String C = "abcdefghijklmnopqrstuvwxyz";
        char s[] = S.toCharArray();
        char c[] = C.toCharArray();
        if (S.length() != 26) {
            Arrays.sort(s);
            for (int i = 0; i < 26; i++) {
                if (S.length() == i || s[i] != c[i]) {
                    ans = String.valueOf(c[i]);
                    break;
                }
            }
            System.out.println(S + ans);
        } else {
            for(int i=0;i<26;i++){
                if(s[25]==c[i]){
                    tmp=i;
                    break;
                }
            }
            int a=25;
            int b=tmp;
            while(true){
                if(s[a]!=c[b]){
                   s[a]=c[tmp];
                   for(int i=0;i<=a;i++){
                       System.out.print(s[i]);
                   }
                   System.out.println();
                   return;
                }
                if(b==25){
                    a--;
                    s[a]=c[tmp];
                    for(int i=0;i<=a;i++){
                        System.out.print(s[i]);
                    }
                    System.out.println();
                    return;
                }
                a--;
                b++;
            }
        }
    }

}