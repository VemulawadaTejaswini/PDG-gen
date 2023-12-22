import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int x = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        if(is_square(x)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    public static boolean is_square(int x){
        int sqrt = (int)Math.floor(Math.sqrt(x));
        return (sqrt*sqrt == x);
    }
}