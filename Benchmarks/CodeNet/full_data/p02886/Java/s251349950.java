import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = 0;
        int [] num = new int[n];
        for (int i=0;i<n;i++){
            num[i]=scanner.nextInt();
        }
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                d += num[i]*num[j];
            }

        }
        System.out.println(d);
    }
}