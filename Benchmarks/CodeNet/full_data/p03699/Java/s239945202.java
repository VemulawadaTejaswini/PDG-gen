
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] Ss = new int[N];
        for(int i=0;i<N;i++){
            Ss[i] = sc.nextInt();
        }

        Arrays.sort(Ss);
        int sum = Arrays.stream(Ss).sum();

        for (int i = 0; i < N && 0 == sum%10 ; i++){
            sum -= Ss[i];
        }
        System.out.print(sum);

    }
}