import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++) {
            list.add(sc.nextInt());
        }
        for(int i=1; i<=n; i++) {
            System.out.print(list.indexOf(Integer.valueOf(i)) + 1);
            if(i != n) System.out.print(" ");
        }
        System.out.println();
    }
}