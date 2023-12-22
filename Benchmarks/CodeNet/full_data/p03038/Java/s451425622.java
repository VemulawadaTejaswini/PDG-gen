import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int tmp = sc.nextInt();
            list.add(tmp);
        }

        for(int i = 0; i < m; i++){
            int b = sc.nextInt();
            int c = sc.nextInt();
            for(int j = 0; j < b; i++){
                list.add(c);
            }
        }

        ArrayList<Integer> sorted = new ArrayList<>();
        Collections.reverse(list);
        
        long result = 0;
        for(int i = 0; i < n; i++){
            result += list.get(i);
        }

        System.out.println(result);
    }
}
