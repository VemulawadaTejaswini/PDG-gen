/**
 * Created by abhishek on 8/12/2016.
 */
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws Exception {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < str.length();i++){
            if(str.charAt(i) != 'B')
                sb.append(str.charAt(i));
            else sb.deleteCharAt(sb.length() - 1);
        }
        System.out.print(sb.toString());

    }
}
