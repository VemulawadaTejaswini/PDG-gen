import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] X = new int[N];
        int hsum = 0;
        int min = 0;

        for(int i=0; i<N; i++){
            X[i] = sc.nextInt();
        }
        for(int i=1; i<=100; i++){
            for(int j=0; j<N; j++){
                hsum += Math.pow((X[j] - i), 2);
            }
            if(i==1){
                min = hsum;
            }
            min = Math.min(min, hsum);
            hsum = 0;
        }
        System.out.println(min);
    }
}