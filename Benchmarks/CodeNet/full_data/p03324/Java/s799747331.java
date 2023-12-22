import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int n = sc.nextInt();

        int answer = 0;
        int d2 = 1;
        for(int i = 0;i<d;i++){
            d2 *= 100;
        }
        for(int i = 1;i<=n;i++){
                answer = i*d2;
        }
        System.out.println(answer);
    }
}