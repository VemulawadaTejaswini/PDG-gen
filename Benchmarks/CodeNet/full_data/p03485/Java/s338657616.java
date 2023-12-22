import java.io.*;
import java.util.*;

class Main {
    public void run() throws Exception {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        sum += sc.nextInt();
        sum += sc.nextInt();
        System.out.println(Math.round(sum / 2.0));
    }

    public static void main(String... args) throws Exception{
        new Main().run();
    }
}
