import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 0;
        for(int i = 0; i < n; i++){
            if(i % 3 == 0 || i % 5 == 0){
                continue;
            }
            ans += i;
        }
        System.out.println(ans);
    }

}