import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        System.out.println(submit(3,2));
    }

    public static String submit(int n, int m){
        if(n == m)
            return "Yes";
        return "No";
    }