import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int count = 0;

        if(b > 1){
            count += Math.ceil((b - a) / (a - 1.0)) + 1;
        }
        

        System.out.println(count);
    }
}