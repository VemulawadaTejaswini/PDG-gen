import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static int createNumber(int x){
        int n = (x*10 + x) * 10 + x;
        return n;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = in.nextInt();
        if (n > 999){
            System.out.println(1111);
        }
        else {
            int first = (n /10) /10;
            if (n <= createNumber(first))
                System.out.println(createNumber(first));
            else System.out.println(createNumber(first+1));
        }
    }
    
}