import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Pair[] array = new Pair[m];
        for(int i = 0; i < m; i++) {
            array[i] = new Pair(sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(array, (p1, p2) -> p1.b - p2.b);
        int count = 0;
        for(int i = 0; i < m; i++) {
            int b = array[i].b;
            int j = i;
            while(j < m && b > array[j].a) j++;
            count++;
            i = j - 1;
        }
        System.out.println(count);
    }

    private static class Pair{
        int a;
        int b;
        Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }
}
