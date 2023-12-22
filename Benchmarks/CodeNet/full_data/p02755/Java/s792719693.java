import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> hs = new HashSet<Integer>();
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i = 1; i <= 1250; i++){
            int t8 = (int)Math.floor(i*0.08);
            int t10 = (int)Math.floor(i*0.1);
            if(a == t8 && b == t10){
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}