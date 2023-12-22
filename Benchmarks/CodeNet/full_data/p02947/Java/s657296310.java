import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] s = new String[n];
        for(int i = 0; i < n; i++) s[i] = scan.next();
        char[][] sa = new char[n][10];
        String[] ss = new String[n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 10; j++){
                sa[i][j] = s[i].charAt(j);
            }
            Arrays.sort(sa[i]);
            ss[i] = new String(sa[i]);
        }
        Arrays.sort(ss);
        long out = 0;
        for(int i = 0; i < n - 1; i++){
            for(int j = i; j < n; j++){
                if(ss[i].equals(ss[j])) out++;
            }
        }
        System.out.println(out / 2l);
        scan.close();
    }
}