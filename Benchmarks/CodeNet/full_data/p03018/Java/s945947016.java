import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    // static final int modnum = 1e9 + 7;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int ans = 0;

        for(int i=0;i<s.length()-2;i++){
            if(s.substring(i, i+3).equals("ABC")){
                s=s.substring(0, i)+"BCA"+s.substring(i+3);
                i = Math.max(0,i-4);
                ans++;
                // System.out.println(s);
            }
        }

        System.out.println(ans);
    }
}