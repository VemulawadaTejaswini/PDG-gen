import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        //int a[] = new int[n];
        //int b[] = new int[n];
        String ans = "No";
        if(n == m){
            ans = "Yes";
        }
        
        
        System.out.println(ans);
    }
}