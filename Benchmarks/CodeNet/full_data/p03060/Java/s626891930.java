import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] v = new int[n];
        for(int i = 0; i < n; i++) {
            v[i] = scanner.nextInt();
        }
        int[] c = new int[n];
        for(int i = 0; i < n; i++) {
            c[i] = scanner.nextInt();
        }
        
        int[] value = new int[n];
        int max = 0;
        for(int i = 0; i < n; i++) {
            value[i] = v[i] - c[i];
            if(value[i] > 0) max += value[i];
        }

        System.out.println(max);

    }
}