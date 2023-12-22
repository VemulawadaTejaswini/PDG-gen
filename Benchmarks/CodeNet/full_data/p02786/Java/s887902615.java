import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long h = sc.nextLong();
        long ans = 1;
        long i = 1;
        while(h > 1){
            h = h / 2;
            i = i *2;
            ans = ans + i;

        }
        
        System.out.println(ans);
    }
}