import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int position = 0;
        int count = 0;
        for(int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            count++;
            position += tmp;
            if(position > x) break;
        }
        System.out.println(count);
    }
}