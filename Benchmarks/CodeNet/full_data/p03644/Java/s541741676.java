import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int max = 0;
        int ans = 0;

        for(int i=1; i<=N; i++){
            int x = i;
            int y = 0;
            for(int j=1; j<=100; j++){
                if(x%2!=0){
                    break;
                }
                else{
                    x = x / 2;
                    y += 1;
                }
            }
            max = Math.max(max, y);
            if(max==y){
                ans = i;
            }
        }
        System.out.println(ans);
    }
}