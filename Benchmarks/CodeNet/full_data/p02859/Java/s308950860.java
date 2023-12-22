import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = Integer.parseInt(sc.next());
        int[] x = new int[N];
        int[] y = new int[N];
        double sum = 0;
        int x_sum = 0;
        int y_sum = 0;
        for(int i=0;i<N;i++){
            x[i] = Integer.parseInt(sc.next());
            y[i] = Integer.parseInt(sc.next());
        }
        for(int i=0;i<N-1;i++){
            for(int j=i+1;j<N;j++){
                x_sum = (x[i]-x[j])*(x[i]-x[j]);
                y_sum = (y[i]-y[j])*(y[i]-y[j]);
                sum+=Math.sqrt(x_sum+y_sum);
            }
        }

        System.out.println(sum*2/N);
        System.out.flush();
    }
}