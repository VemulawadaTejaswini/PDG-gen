import java.io.*;
import java.util.*;


class Main{
    public int luca(int n){
        int l = 2;
        int ln = 1;
        for(int i = 1; i < n;i++){
            int tmp = l;
            l = ln;
            ln = tmp + ln;
            // System.out.println(ln);
        }
        return ln;
    }

    public void run() throws Exception{
        Scanner cin = new Scanner(System.in);
        int arg = cin.nextInt();
        System.out.println(luca(arg));
    }

    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}
