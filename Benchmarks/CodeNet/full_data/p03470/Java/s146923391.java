import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Set mochi = new HashSet<Integer>();
        for(int n=0;n<N;n++) mochi.add(sc.nextInt());
        System.out.println(mochi.size());
    }
}