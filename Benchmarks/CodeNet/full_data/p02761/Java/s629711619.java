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
        boolean check = false;
        int N = Integer.parseInt(sc.next());
        int[] keta = new int[N];
        int M = Integer.parseInt(sc.next());
        int[] s = new int[N];
        int[] c = new int[N];
        for(int i = 0; i < N; i++){
            keta[i] = -1;
        }
        for(int i = 0; i < M; i++){
            s[i] = Integer.parseInt(sc.next());
            c[i] = Integer.parseInt(sc.next());
            if(keta[s[i]-1] == -1){
                keta[s[i]-1] = c[i];
            }else if(keta[s[i]-1] == c[i]){

            }else{
                check = true;
            }
        }
        if(check){
            System.out.println(-1);
        }else{
            if(keta[0] <= 0){
                System.out.print(1);
            }else{
                System.out.print(keta[0]);
            }
            for(int i = 1; i < N; i++){
                if(keta[i] <= -1){
                    System.out.print(0);
                }else{
                    System.out.print(keta[i]);
                }
            }
            System.out.println();
        }

        out.flush();
    }

}