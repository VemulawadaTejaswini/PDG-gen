import java.io.BufferedInputStream;
import java.math.BigInteger;
import java.util.Scanner;
public class Main {
    public static boolean slove(String c){
        char m[]=c.toCharArray();
        for(int i=0;i<m.length;i++){
            if(m[i]!=m[m.length-1-i])
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        String s=sc.next();
        String x=s.substring(0,(s.length()-1)/2);
        String y=s.substring((s.length()+2)/2);
        //System.out.println(x+"  "+y);
        if(Main.slove(s)&&Main.slove(x)&&Main.slove(y))
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}