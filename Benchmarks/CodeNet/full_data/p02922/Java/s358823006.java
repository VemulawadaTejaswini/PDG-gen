import java.util.*;

public class Main {

    public static void main(String[] args) {
        exec();
    }

    static void exec() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a >= b) {
            System.out.println(1);
            System.exit(0);
        }

        int count = 1;
        int tmp = a;

        while(true) {
            tmp = tmp +( a-1 );
            count ++;
            if(tmp >= b) {
                break;
            }
        }
        System.out.println(count);

    }
}
