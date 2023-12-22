import java.util.Scanner;
import java.util.Stack;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        for (int i = 1; i < n; i++) {
            if (i % 2 != 0) {
                s1.add(a[i]);
            } else {
                s2.add(a[i]);
            }
        }
        if (n % 2 == 0) {
            while (!s1.isEmpty()) {
                System.out.print(s1.pop() + " ");
            }
            System.out.print(a[0] + " ");
            while (!s2.isEmpty()) {
                System.out.print(s2.pop() + " ");
            }
            System.out.println();
        } else {
            while (!s2.isEmpty()) {
                System.out.print(s2.pop() + " ");
            }
            System.out.print(a[0] + " ");
            while (!s1.isEmpty()) {
                System.out.print(s1.pop() + " ");
            }
            System.out.println();
        }
    }
}
