import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long x = in.nextLong();
        long result = 1;
        x = x-1;
        
        result = result + (x/11)*2;
        if (x%11 != 0) result++;
        System.out.println(result);
    }
}