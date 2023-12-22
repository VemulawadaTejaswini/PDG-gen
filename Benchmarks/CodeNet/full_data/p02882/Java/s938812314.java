import java.util.*;
import java.io.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                Map hs = new HashMap();
                PrintWriter ou = new PrintWriter(System.out);
                int a = Integer.parseInt(sc.next());
                int b = Integer.parseInt(sc.next());
                int x = Integer.parseInt(sc.next());
                sc.close();
                if(a * a * b > 2 * x) ou.print(Math.atan(a * b * b / 2.0 / x) / Math.PI * 180 + "\n");
                else ou.print(Math.atan(2.0 * (a * a * b - x) / a / a / a) / Math.PI * 180 + "\n");
                ou.flush();
        }
}