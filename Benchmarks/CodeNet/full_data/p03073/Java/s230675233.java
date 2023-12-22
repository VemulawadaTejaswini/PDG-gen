import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int bsta = 0;
        int wsta = 0;
        for (int i = 0; i  < s.length; i ++) {
            if(i % 2 == 0){
                if(s[i] == '0') bsta++;
                else wsta++;
            }else{
                if(s[i] == '1') bsta++;
                else wsta++;
            }
        }
        System.out.println(Math.min(bsta, wsta));
        sc.close();

    }

}
