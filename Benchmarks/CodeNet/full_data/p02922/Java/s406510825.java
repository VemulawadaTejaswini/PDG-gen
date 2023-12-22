import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int init = 1;
        int first = scan.nextInt();
        int second = scan.nextInt();
        int count = 0;

        while (true) {
            init--;
            init = init + first;
            if (init >= second) {
                count++;
                break;
            }
        }
        System.out.println(count);
    }
 }