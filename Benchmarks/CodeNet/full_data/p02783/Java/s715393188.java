import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int a = sc.nextInt();
        int ans =  0;
        
        while(h > 0){
            h = h -a;
            ans++;
        }
        
        System.out.println(ans);
    }
}