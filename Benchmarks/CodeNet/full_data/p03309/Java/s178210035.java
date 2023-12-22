import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 0;
        N = scanner.nextInt();
        int[] val= new int[N];
       for(int x=0; x<N; x++)val[x]=scanner.nextInt();
        int sum = 0;
        int b = 0;
        for(int x = 0; x<N; x++){
            sum = sum + Math.abs(val[x] - (b+x+1));
        }
        System.out.println(sum);
    }

}
