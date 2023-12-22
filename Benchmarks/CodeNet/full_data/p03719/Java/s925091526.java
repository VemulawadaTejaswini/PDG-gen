import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        if (c >= a && c <= b){
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }
    
}