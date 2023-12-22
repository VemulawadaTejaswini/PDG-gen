import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String st=in.next();
        int c=0;
        for (int i = 0; i <st.length(); i++) {
            if(st.charAt(i)=='0'){
                c++;
            }
        }
        System.out.println(c);
    }
}