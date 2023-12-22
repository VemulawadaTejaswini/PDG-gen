import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

	
    public static void main(String[] args) {
    	
        Scanner in = new Scanner(System.in);
        
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int D = in.nextInt();
        
        System.out.println(Math.min(A, B)+Math.min(C, D));
        in.close();
    }

	
}
