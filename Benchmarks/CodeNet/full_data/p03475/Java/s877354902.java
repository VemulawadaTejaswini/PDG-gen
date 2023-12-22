import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] c = new int[n];
        int[] s = new int[n];
        int[] f = new int[n];
        for (int i = 0; i < n - 1; i++) {
            c[i] = scan.nextInt();
            s[i] = scan.nextInt();
            f[i] = scan.nextInt();
        }

        int[] start = new int[n];
        int[] result = new int[n];
        for (int i = n-2; i >= 0; i--) {
            start[i] = (s[i] >= start[i+1] - c[i] + start[i] % f[i]) ? s[i] : start[i+1] - c[i] + start[i] % f[i];
            result[i] = start[i] + c[i] + result[i+1] - start[i+1];
        }
        for(int i : result){
            System.out.println(i);
        }
    }


}
