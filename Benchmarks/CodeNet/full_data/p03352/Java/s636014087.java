
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        
        int p = 2;
        int q = 1;
        double num1 = 1;
        double num2 = 1;
        double power = Math.pow(p, q);
        
        for(p = 2; Math.pow(p, q) <= X; p++){
            for(q = 2; Math.pow(p, q) <= X; q++){
                num1 = Math.pow(p, q);
            }
            if(num2 < num1){
                num2 = num1;
            }
            q = 1;
        }
        System.out.println((int)num2);
    }
}