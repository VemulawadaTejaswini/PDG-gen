import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //int N = Integer.parseInt(scan.next());
        int N = Integer.parseInt(scan.next());
        int T = Integer.parseInt(scan.next());
        int A = Integer.parseInt(scan.next());
        int[] h = new int[N];
        double[] ave = new double[N];
        double[] delta = new double[N];
        double tmp = 1000;
        int out=-1;
        for(int i = 0;i<N;i++){
            h[i] = Integer.parseInt(scan.next());
            ave[i] = T-(h[i]*0.006);
        }
        for(int i = 0;i<N;i++){
            delta[i] = Math.abs(A-ave[i]);
            System.out.println(delta[i]);
            if(tmp>=delta[i]){
                tmp = delta[i];
                out = i;
            }
        }
        System.out.println(out+1);






        /*long N = Longe.parseInt(scan.next());
        long out;
        long num = 1000000000;
        for(long i = 1;i<=num;i++){
            if(i%2==0 && i%N==0){
                out = i;
                System.out.println(out);
                break;
            }
        }*/

    }
}