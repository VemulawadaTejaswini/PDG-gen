import java.util.*;

public class Main{

    public static List<Integer> P;
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int sum = 0;
        for(int i=0; i<M; i++){
            sum +=scanner.nextInt();
        }
        if(N-sum >= 0){
            System.out.println(N-sum);
        }else{
            System.out.println(-1);
        }
    }
}