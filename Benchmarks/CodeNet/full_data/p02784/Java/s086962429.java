import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++) {
            list.add(sc.nextInt());
        }
        for(int i=0; i<n; i++) {
            h -= list.get(i);
        }
        if(h <= 0) System.out.println("Yes");
        else System.out.println("No");
    }
}