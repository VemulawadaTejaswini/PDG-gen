import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int init = 1;
        int first = scan.nextInt();
        int second = scan.nextInt();
        int count = 0;

        while (true) {
            count++;
            init--;
            init = init + first;
            if (init >= second) {
                break;
            }
        }
        System.out.println(count);
    }
 }