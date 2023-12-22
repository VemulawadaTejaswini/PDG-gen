
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("文字の長さは?");
        int L = sc.nextInt();
        System.out.println("文字列の数は?");
        int N = sc.nextInt();
        String[] s = new String[N];
        String tmp = "";

        for(int i = 0; i < s.length; i++){
            s[i] = sc.next();
        }

        Arrays.sort(s);
        for(int i = 0; i < s.length; i++){
            tmp += s[i];
        }
        System.out.println(tmp);
    }
}