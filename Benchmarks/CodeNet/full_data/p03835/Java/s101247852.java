import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int K = sc.nextInt();
            int S = sc.nextInt();
            int K2 = K * 2;

            int count = 0;
            for(int X = 0;X <= K;X++){
                if(K2 + X >= S){
                    for(int Y = 0;Y <= K;Y++){
                        if(S - X - Y <= K){
                            count++;
                        }
                    }
                }
            }
            System.out.println(count);
    }
}