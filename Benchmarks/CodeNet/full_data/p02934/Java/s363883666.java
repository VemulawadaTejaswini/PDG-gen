import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double sum = 0;
        double ans = 0;

        for(int i=0; i<N; i++){
            sum = sum + 1/(double)sc.nextInt();
        }
        ans =1/sum;
        System.out.println(ans);
    }
}