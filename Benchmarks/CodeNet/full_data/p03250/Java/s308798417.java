import java.io.*;
import java.util.*;

public class Main implements Runnable { //Runnableを実装する
    public static void main(String[] args) {
        new Thread(null, new Main(), "", 64 * 1024 * 1024).start(); //16MBスタックを確保して実行
    }

    public void run() {
        //ここに処理を書く
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[]s = {a,b,c};
        Arrays.sort(s);
        System.out.println(s[2]*10+s[1]+s[0]);
    }
}
