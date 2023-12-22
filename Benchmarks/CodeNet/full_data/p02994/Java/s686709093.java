import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int L = Integer.parseInt(sc.next());
        int sum = L*N;
        for(int i = 0; i <= N-1; i++) {
            sum += i;
        }
        
        if(L > 0) {
            sum -= L;
        }else {
            if(N + L <= 0) {
                sum -= (L + N - 1);
            }
        }
        System.out.println(sum);
    }
}