import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int k;
        int c = 0;
        while ((k = search(s)) >= 0){
            s[k] = 'W';
            s[k + 1] = 'B';
            ++c;
        }
        System.out.println(c);
    }

    public static int search(char[] cs){
        int t = -1;
        for (int i = 0;i < cs.length - 1;++i){
            if(cs[i] == 'B' && cs[i + 1] == 'W'){
                t = i;
                break;
            }
        }
        return t;
    }
}


