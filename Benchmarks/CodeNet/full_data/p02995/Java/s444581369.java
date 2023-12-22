import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();
        int dc = sc.nextInt();
        int dd = sc.nextInt();
        int ans = 0;
        for(int i = 0; i <= max - min; i++){
            int value = min + i;
            if(value % dc != 0 && value % dd != 0){
                ans++;
            }
        }
        System.out.println(ans);
    }
}