import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int[] Max = new int[N];
        int[] Lm = new int[M];
        int count = 0;

for(int i=0;i<M;i++){
    Lm[i] = scan.nextInt();
}

Arrays.sort(Lm);


int Xb = Lm[0];
        for(int i=1;i<M;i++){
            int Xa = Lm[i];
            int J = Xa-Xb;
            if(J <= 0){
                J *= -1;
            }
            count += J;
            for(int l = 0;l<N;l++){
                if(J > Max[l]){
                    Max[l] = J;
                    break;
                }
            }
            Xb = Xa;
        }
        scan.close();

        for(int i=0;i<N-1;i++){
            count -= Max[i];
        }
            System.out.println(count);
    }
}