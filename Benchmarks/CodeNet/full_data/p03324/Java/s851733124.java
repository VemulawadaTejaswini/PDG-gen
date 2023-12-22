import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int N = sc.nextInt();
        if(D == 0) {
            if (N == 100){
                N += 1;
            }
            System.out.println(N);
        } else {
            int answer = N * (int)Math.pow(100, D);
            if (N == 100){
                answer += 1;
            }
            System.out.println(answer);
        }
    }
}
