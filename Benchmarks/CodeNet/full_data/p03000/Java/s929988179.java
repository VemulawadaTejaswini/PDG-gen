import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int[] l = new int[n];
        int d = 0;
        for(int i = 0; i < n; i++){
            l[i] = scanner.nextInt();
        }

        int i = 0;
        while(d <= x){
            d = d + l[i];
            i++;
        }
        System.out.println(i);
    }
}
