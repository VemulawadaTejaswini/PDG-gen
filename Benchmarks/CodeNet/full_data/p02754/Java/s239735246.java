import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Double A = sc.nextDouble();
        Double B = sc.nextDouble();

        Double divide = Math.floor(N/(A+B));
        int ans = 0;
        ans += divide * A;

        if(N%(A+B) >= A){
            ans += A;
        }else{
            ans += N%(A+B);
        }

        System.out.println(ans);


    }

}
