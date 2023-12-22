import java.io.*;
import java.util.*;

public class Main{

    static PrintStream out = System.out;


    static void solve(Scanner in){


        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();

        int num = B / A;
        if(num >= C) out.println(C);
        else out.println(num);

    }

    public static void main(String[] args){
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        solve(in);
    }
}