//package javaapplication2;
import java.util.*;
import java.io.*;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(solve(br.readLine()));
    }
    
    private static String solve(String s){
        if(s.equals("AAA") || s.equals("BBB")) return "No";
        return "Yes";
    }
}
