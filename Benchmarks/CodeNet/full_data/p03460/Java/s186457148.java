import static java.lang.Math.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            int K = scanner.nextInt();
            int [] x = new int[N];
            int [] y = new int[N];
            char [] c = new char[N];
            
            for (int i=0; i<N; i++){
                x[i] = scanner.nextInt();
                y[i] = scanner.nextInt();
                c[i] = scanner.next().charAt(0);
            }

            int nhope = 0;        
            for (int i=0; i<(N-1); i++){
                for (int j=i+1; j<N; j++){
                    if ((c[j] !='z')){
                        if (c[j]==c[i]) {
                            if ((abs(x[j]-x[i]) < K) || (abs(y[j]-y[i]) < K)) {
                                c[j] = 'z';
                                nhope++;
                            }
                        } else {
                            if ((abs(x[j]-x[i]) >= K) == (abs(y[j]-y[i]) >= K)){
                                c[j] = 'z';
                                nhope++;
                            }
                        }
                    }
                }
            }
            System.out.println(nhope);
        }
}