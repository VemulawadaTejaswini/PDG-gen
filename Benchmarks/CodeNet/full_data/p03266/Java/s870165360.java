import java.util.*;
 
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 

        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.close();
        int count_1 = 0;
        int count_2 = 0;
        if(K == 2){
            for(int i = 1; i <= N; i = i+2)
                count_1++;
            for(int i = 2; i <= N; i = i+2)
                count_2++;
            System.out.println((int)(Math.pow(count_1, 3) + Math.pow(count_2, 3)));
        } else {
            if(K%2 == 1){
                if(N < K){
                    System.out.println(0);
                } else {
                    for(int i = K; i <= N; i = i + K){
                        count_1++;
                    }
                    System.out.println((int)Math.pow(count_1, 3));
                }
            } else{
                for(int i = K/2; i <= N; i = i + K){
                    count_1++;
                }
                for(int i = K; i <= N; i = i+K){
                    count_2++;
                }
                System.out.println((int)(Math.pow(count_1, 3)+Math.pow(count_2, 3)));
            }
        }
    }
}