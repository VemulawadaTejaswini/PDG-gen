import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();//n回
        int b = sc.nextInt();//何番目

        if(b!=100)
            System.out.println((int)Math.pow(100,a) * b);
        else
            System.out.println((int)Math.pow(100,a) * (b+1));
    }
}
