import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a == 1){
            System.out.println("Hello World");
        } else if(a == 2){
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(b + c);
        }
    }
}
