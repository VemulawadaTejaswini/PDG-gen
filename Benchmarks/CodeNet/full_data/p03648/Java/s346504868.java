import java.util.*;

/**
 * Created by mizuk on 2017/07/26.
 */
public class Main {
    private static final int N = 10;
    private static int K;
    private static ArrayList<Integer> a = new ArrayList<Integer>();

    public static void input(){
        Scanner scan = new Scanner(System.in);
        K = scan.nextInt();
    }

    public static void main(String args[]){
        //入力
        input();

        a.add(0,N*K);
        for (int i=1;i<N;i++){
            a.add(i,0);
        }

        System.out.println(N);
        for (int i=0;i<N;i++){
            System.out.print(a.get(i) + " ");
        }

    }
}