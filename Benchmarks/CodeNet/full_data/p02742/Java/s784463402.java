import sun.font.BidiUtils;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Long h = sc.nextLong();
        Long w = sc.nextLong();
        BigInteger hb = new BigInteger(""+h);
        BigInteger wb = new BigInteger("" +w);
        BigInteger two = new BigInteger("2");
        BigInteger one  = new BigInteger("1");
        String hs = ""+h;
        String ws = ""+w;
        
        
        
        
        if(hs.charAt(hs.length()-1) =='2' ||
                hs.charAt(hs.length()-1) =='4' ||
                hs.charAt(hs.length()-1) =='6' ||
                hs.charAt(hs.length()-1) =='8' ||
                hs.charAt(hs.length()-1) =='0' ||
                ws.charAt(ws.length()-1) =='2' ||
                ws.charAt(ws.length()-1) =='4' ||
                ws.charAt(ws.length()-1) =='6' ||
                ws.charAt(ws.length()-1) =='8' ||
                ws.charAt(ws.length()-1) =='0'
        ){
            System.out.println(hb.multiply(wb).divide(two));
        }else {
            System.out.println(hb.multiply(wb).divide(two).add(one));
        }


    }
}
