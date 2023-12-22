import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] col = new int[3];
        for(int i = 0;i < 3;i++){
            col[i] = sc.nextInt();
        }
        Arrays.sort(col);
        int N = sc.nextInt();
        int min = N / col[0];
        int ans = 0;

        for(int i = N;i >= 0;i--){
            for(int j = 0;i <= N;i++){
                for(int k = 0;i <= N;i++){
                    for(int l = 0;l <= N;l++){
                        if(j*col[0]+k*col[1]+l*col[2] == N)
                        ans++;
                    }
                }
            }
        }
        
        System.out.println(ans);
    }
}