import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] c= new int[N];
        int x = 1;
        for(int i = 1; i < M/2; i++ ){
            if(M%i ==0){
                if(M/i>=N){
                    x=i;
                }
            }
        }
         if(M%M==0){
                if(M/M>=N){
                    x=M;
                }
            }
        System.out.println(x);
    }
}
