import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] x = new int[2][M];
        for(int i = 0; i < M; i++){
            x[0][i] = sc.nextInt();
            x[1][i] = sc.nextInt();
        }

        int[] num = new int[N];
        Arrays.fill(num, 1);
        int[] red = new int[N];
        red[0] = 1;
        for(int i = 0; i < M; i++){
            if(red[x[0][i]-1] == 1){
                if(num[x[0][i]-1] == 1){
                    red[x[0][i]-1] = 0;
                }
                red[x[1][i]-1] = 1;
            }
            num[x[0][i]-1]--;
            num[x[1][i]-1]++;
        }
        int count = 0;
        for(int i = 0; i < N; i++){
            if(red[i] == 1)
                count++;
        }
        System.out.println(count);
    }   
}