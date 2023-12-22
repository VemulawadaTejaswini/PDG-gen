import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();
        solve(N);
    }

    static void solve(long N){
        System.out.println((int)(Math.pow(N, 3)));

    }
}
