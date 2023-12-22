import static java.lang.Math.*;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            int K = scanner.nextInt();
            int [] x = new int[N];
            int [] y = new int[N];
            char [] c = new char[N];
            int maxx = Integer.MIN_VALUE;
            int maxy = Integer.MIN_VALUE;
            int minx = Integer.MAX_VALUE;
            int miny = Integer.MAX_VALUE;
            
            for (int i=0; i<N; i++){
                x[i] = scanner.nextInt();
                y[i] = scanner.nextInt();
                c[i] = scanner.next().charAt(0);
                maxx = Integer.max(maxx, x[i]);
                maxy = Integer.max(maxy, y[i]);
                minx = Integer.min(minx, x[i]);
                miny = Integer.min(miny, y[i]);
            }

            int nhopeMax = 0;
            int nhope = 0;
            int basex;
            int basey;
            int maxI = min((maxx-minx), K);
            int maxJ = min((maxy-miny), K);
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