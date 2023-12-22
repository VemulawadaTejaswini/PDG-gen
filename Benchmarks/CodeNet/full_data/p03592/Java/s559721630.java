import java.util.Scanner;

/**
 * Created by torum on 2017/09/23.
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        if(K == N*M){
            System.out.println("Yes");
            return;
        }
        if(K > (N*M)){
            System.out.println("No");
            return;
        }
        int count = 0;
       for(int i= 0; i <= N; i++ ){
            for(int j = 0; j<= M;j++){
                count = i*M + j*N - i*j;
                if(K == count){
                    System.out.println("Yes");
                    return ;
                }
            }
       }
       System.out.println("No");


    }
}
