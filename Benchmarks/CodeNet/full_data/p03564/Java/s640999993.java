import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int ans=1;
        for(int i=0;i<N;i++){
            ans=Math.min(ans+K,ans*2);
        }
        System.out.println(ans);
    }
}
