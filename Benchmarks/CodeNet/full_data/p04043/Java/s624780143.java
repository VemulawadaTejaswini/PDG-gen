import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        String result = (a + b + c) == 17 ? "YES" : "NO";

        System.out.println(result);
    }
}