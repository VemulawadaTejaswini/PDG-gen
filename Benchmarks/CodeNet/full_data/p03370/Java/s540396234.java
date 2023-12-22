import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int m[] = new int[N];
        for(int h = 0; h < N; h++){
            m[h] = sc.nextInt();
            X -= m[h];
        }

        Arrays.sort(m);
        int counter = 0;

        while(X >= m[0]){
            X -= m[0];
            counter++;
        }

        counter += N;
        System.out.println(counter);
    }
}