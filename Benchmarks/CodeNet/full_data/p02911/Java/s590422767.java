import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        int Q = Integer.parseInt(sc.next());
        int[] li = new int[N];
        for(int i =0; i < N;i++){
            li[i] = K;
        }
        for(int j =0; j < Q;j++){
            int correct = Integer.parseInt(sc.next())-1;
            for(int i =0; i < N;i++){
                if(i != correct){
                    li[i]--;
                }
            }
        }
        for(int i =0 ; i < N ;i++){
            if(li[i] <= 0){
                System.out.println("No");
            }else{
                System.out.println("Yes");
            }
        }
    }
}