import java.io.*;
import java.util.*;


public class Main {
    static ArrayList<Integer>[] graph;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String[] buf = reader.readLine().split(" ");
        long r = sc.nextLong(), D = sc.nextLong(), x2 = sc.nextLong();
        for(long i=1;i<=10;i++){
            x2 = r*x2-D;
            System.out.println(x2);
        }
    }
}

