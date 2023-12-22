import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] answer = new int[N];
        Arrays.fill(answer,-1);
        for(int i = 0 ; i<M ; i++){
            int s = sc.nextInt()-1;
            int c = sc.nextInt();
            if(s == 0 && c == 0 && N != 1){
                System.out.println(-1);
                return;
            }
            if(answer[s] == c || answer[s] == -1){
                answer[s]=c;
            }else{
                System.out.println("-1");
                return;
            }
        }
        for(int i = 0 ; i < N ; i++){
            if(answer[i] != -1){
                System.out.print(answer[i]);
            }else{
                if(N > 1 && i == 0){
                    System.out.print(1);
                  } else {
                    System.out.print(0);
                  }
            }
        }
        System.out.print("\n");
    }
}