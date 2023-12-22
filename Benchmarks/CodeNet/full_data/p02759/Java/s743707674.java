import java.util.*;
import java.io.*;

public class Main implements Runnable{
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException{
        new Thread(null, new Main(), "", 32 * 1024 * 1024).start();
        Thread.setDefaultUncaughtExceptionHandler((t,e)->System.exit(1));
        out.flush();
    }

    public void run(){
        int N = Integer.parseInt(sc.next());
        if(N%2 != 0){
            N = N+1;
        }
        out.println(N/2);
        out.flush();
    }

}