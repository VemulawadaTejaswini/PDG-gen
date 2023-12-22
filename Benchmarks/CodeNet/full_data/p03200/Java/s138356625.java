import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        long w = 0;
        long c = 0;
        for (int i = 0;i < s.length;++i){
            if(s[i] == 'W'){
                c += i - w;
                ++w;
            }
        }
        System.out.println(c);
    }

}


