import java.io.*;
import java.util.*;
import java.lang.String;
import java.util.Arrays;

import static java.lang.Integer.min;
import static java.lang.Integer.parseInt;

public class Main extends PrintWriter {
    Main() { super(System.out, true); }
    Scanner sc = new Scanner(System.in);
    public static void main(String[] $) {
        Main o = new Main(); o.main(); o.flush();
    }

    void main(){

        char []A = new char[3];
        String B = sc.next();
        for(int i = 0; i < 3; i++){
            A[i] = B.charAt(i);

        }
        if(A[0] == A[1] && A[1] == A[2]){
            print("No");
        }
        else
        {
            print("Yes");
        }


    }
}