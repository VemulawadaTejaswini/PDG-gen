import java.util.*;
import java.io.*;
public class Main {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                PrintWriter ou = new PrintWriter(System.out);
                int n = Integer.parseInt(sc.next());
                if(n == 1){
                        ou.print("Hello World\n");
                }else{
                        ou.print(Integer.parseInt(sc.next()) + Integer.parseInt(sc.next()) + "\n");
                }
                ou.flush();
        }
}