import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] answer = new int[M];
        Arrays.fill(answer, -1);
        for(int i = 0; i < M; i++){
            int s = sc.nextInt();
            int c = sc.nextInt();
            if(s == 1 && c == 0 && N != 1){
                System.out.println("-1");
                System.exit(0);
            }
            if(answer[s-1]==-1 || answer[s-1]==c){
                answer[s-1] = c;
            }else{
                System.out.println("-1");
                System.exit(0);
            }
        }
        for(int digit: answer){
            if(digit==-1){
                System.out.print(0);
            }else{
                System.out.print(digit);
            }
        }
        System.out.print("\n");
    }
}