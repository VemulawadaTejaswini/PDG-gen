/**
 * Created by abhishek on 8/12/2016.
 */
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws Exception {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String str = br.readLine();
        boolean flag = false;
        int pos = -1;
        for(int i = 1;i < str.length();i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                flag = true;
                pos = i;
            }
        }
        if(flag){
            System.out.println(pos + " " + (pos - 1));
            return;
        }
        for(int i = 2;i < str.length();i++) {
            if (str.charAt(i) == str.charAt(i - 1) || str.charAt(i - 1) == str.charAt(i - 2) ||
                    str.charAt(i - 2) == str.charAt(i)) {
                flag = true;
                pos = i;
            }
        }
        if(flag)System.out.print(pos + " " + (pos - 2));
        else System.out.println("-1 -1");

    }
}
