import java.util.*;
import java.io.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                Map hs = new HashMap();
                PrintWriter ou = new PrintWriter(System.out);
                long a = Long.parseLong(sc.next());
                long b = Long.parseLong(sc.next());
                long k = Long.parseLong(sc.next());
                k = Long.parseLong(sc.next());
                sc.close();
                ou.print((long)((a - b) * Math.pow(-1 , k)) + "\n");
                ou.flush();
        }
}