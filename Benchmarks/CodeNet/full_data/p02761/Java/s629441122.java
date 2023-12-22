import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int ans = 0;
        boolean error = false;
        int [] num = new int[N];
        for(int i=0;i<N;i++){
            num[i] = -1;
        }

        for(int i=0;i<M;i++){
            int s = sc.nextInt();
            int c = sc.nextInt();
            if(s > N){
                error = true;
                break;
            }
            if(c == num[s-1] || num[s-1] == -1){
                num[s-1] = c;
            } else {
                error = true;
                break;
            }

        }
        if(num[0] == 0){
            if(N != 1){
                error = true;
            }

        } else if (num[0] == -1){
            num[0] = 1;
        }

        for(int i=0;i<N;i++) {
            if (num[i] == -1) {
                num[i] = i == 0 ? 1 : 0;
            }
            ans += num[i] * Math.pow(10, N - 1 - i);
        }

        if(error){
            ans = -1;
        }

        System.out.println(ans);


    }

}






