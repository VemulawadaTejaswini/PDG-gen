import java.util.*;
import java.io.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                PrintWriter ou = new PrintWriter(System.out);
                long a = Long.parseLong(sc.next());
                long b = Long.parseLong(sc.next());
                int c = Integer.parseInt(sc.next());
                int d = Integer.parseInt(sc.next());
                sc.close();
                int cc = c;
                int dd = d;
                long s = 1;
                for(int i = 2 ; i <= c ; i++){
                        if(c % i == 0 && d % i == 0){
                                s *= i;
                                c /= i;
                                d /= i;
                                i--;
                        }
                }
                a--;
                s *= c * (long)d;
                long yono = b - a - b / cc + a / cc - b / dd + a / dd + b / s - a / s;
                ou.print(yono + "\n");
                ou.flush();
        }
}