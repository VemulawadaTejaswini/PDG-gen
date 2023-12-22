
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N =  sc.nextInt();
        int M =  sc.nextInt();


        int[] v = new int[N];
        int tv = 0;
        for (int i = 0; i < N ; i++) {
            v[i] = sc.nextInt();
            tv += v[i];
        }


        int count = 0;
        for (int i = 0; i < N; i++) {
            int n = v[i];
            if(n*4*M>=tv){
                count++;
            }
        }


        System.out.println( count>=M?"Yes":"No");
    }

}
