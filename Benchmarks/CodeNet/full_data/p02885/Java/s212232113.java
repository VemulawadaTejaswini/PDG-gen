import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int answer = a - b * 2;
        if (answer < 0 ) {
            answer = 0;
        }
        System.out.println(answer);
    }
}
