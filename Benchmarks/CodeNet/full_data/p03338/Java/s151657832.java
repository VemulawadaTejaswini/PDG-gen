import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int max = 0;
        for (int i = 1; i < s.length()-1; i++) {
            int cnt = 0;
            StringBuffer t = new StringBuffer();
            StringBuffer u = new StringBuffer();
            for (int j = 0; j < s.length(); j++) {
                if(j < i){
                    t.append(s.charAt(j));
                }else {
                    u.append(s.charAt(j));
                }
            }
            for (char j = 'a'; j <= 'z'; j++) {
                if(t.indexOf(String.valueOf(j)) != -1 && u.indexOf(String.valueOf(j)) != -1){
                    cnt++;
                }
            }
            max = Math.max(max,cnt);
        }
        System.out.println(max);

        sc.close();
    }
}

class io{
    public static void br(){
        System.out.println("");
    }

    public static void YesNo(boolean f) {
        System.out.println(f?"Yes":"No");
    }
    public static void YESNO(boolean f) {
        System.out.println(f?"YES":"NO");
    }

}

class Algo{
    public static boolean isOdd(int n){
        return n % 2 == 1;
    }
    public static boolean isEven(int n){
        return n % 2 == 0;
    }


}

