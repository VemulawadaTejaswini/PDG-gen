import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int v[] = new int[N];
        for (int i = 0;i<N;i++){
            v[i] = sc.nextInt();
        }
        Arrays.sort(v);
        double result = v[0];
        for (int i =1;i<N;i++){
            result = (result+v[i])/2.0;
        }
        System.out.println(result);

    }
}
