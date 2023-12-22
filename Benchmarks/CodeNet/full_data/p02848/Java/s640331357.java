import java.io.UnsupportedEncodingException;
import java.util.*;

public class Main{
    public static void main(String[] args) throws UnsupportedEncodingException{
        Scanner scan = new java.util.Scanner(System.in);
        byte n = scan.nextByte();
        String s = scan.next();
        byte[] a = new byte[s.length()];
        for(int i = 0; i < s.length(); i++){
            a[i] = (byte) (s.codePointAt(i) - 65);
            a[i] = (byte) ((a[i] + n) % 26 + 65);
        }
        System.out.println(new String(a, "UTF-8"));
    }
}