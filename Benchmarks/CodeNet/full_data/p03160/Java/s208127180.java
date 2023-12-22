import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] h = new int[n];
        for (int i = 0; i< n; i++){
            h[i] = scanner.nextInt();
        }

        int[] Table = new int[n];
        Table[0] = 0;
        Table[1] = Math.abs(h[0]-h[1]);

        for (int i = 2; i < n; i++){
            if (Math.abs(h[i-2]-h[i]) < Math.abs(h[i-1]-h[i])){
                Table[i] = Table[i-2] + Math.abs(h[i-2]-h[i]);
            }
            else {
                Table[i] = Table[i-1] + Math.abs(h[i-1]-h[i]);
            }
        }
        System.out.println(Table[n-1]);
    }
}
