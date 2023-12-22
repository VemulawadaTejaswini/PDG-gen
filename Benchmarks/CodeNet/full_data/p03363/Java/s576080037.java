import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A[] = new int[N];

        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }

        int counter = 0;

        for(int j = 0; j < N; j++){
            int sum = 0;
            for(int k = j; k < N; k++){
                sum += A[k];
                if(sum == 0){
                    counter++;
                }
            }
        }

        System.out.println(counter);
    }
}