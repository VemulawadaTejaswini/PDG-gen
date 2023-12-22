import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        int max = 0;
        for(int i = 0; i < N; i++){
            int a = sc.nextInt();
            sum += a;
            if(a > max) max = a;
        }
        if(max < sum - max) System.out.println("Yes");
        else System.out.println("No");

        sc.close();
    }

}
