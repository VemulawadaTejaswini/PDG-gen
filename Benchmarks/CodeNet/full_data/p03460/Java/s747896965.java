import static java.lang.Math.*;
import java.util.Scanner;
*
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

            int nhopeMax = 0;
            int nhope = 0;
            int basex;
            int basey;
            for (int i=K; i>0; i--){
                for (int j=K; j>0; j--){
                    basex = x[0]-i;
                    basey = y[0]-j;
                    for(int l=0; l<N; l++){
                        int distx = abs(x[l]-basex);
                        int disty = abs(y[l]-basey);
                        if ((((distx / K)+(disty / K)) % 2)==0){
                            if (c[0] == c[l]) nhope++;
                        } else {
                            if (c[0] != c[l]) nhope++;
                        }
                        //System.out.println("dx="+distx+" xy="+disty+" x="+x[l]+" y="+y[l]+" col="+c[l]+" nhope="+nhope);
                    }
                    if (nhopeMax < nhope) nhopeMax = nhope;
                    nhope=0;
                    if (nhopeMax == N) break;
                }
                if (nhopeMax == N) break;
            }
            System.out.println(nhopeMax);
        }
}