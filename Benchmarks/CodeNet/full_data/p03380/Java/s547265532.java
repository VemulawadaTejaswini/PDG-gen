import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int ints[]=new int[N];
        for(int i=0;i<N;i++){
            ints[i]=scanner.nextInt();
        }
        Arrays.sort(ints);
        int max=ints[N-1];
        double lenToMid[] = new double[N-1];
        for(int i=0;i<N-1;i++){
            lenToMid[i]=Math.abs(ints[i]-max/2.0);
        }
        double minLenToMid=Double.MAX_VALUE;
        for(int i=0;i<N-1;i++){
            if(minLenToMid>lenToMid[i])minLenToMid=lenToMid[i];
        }
        for(int i=0;i<N-1;i++){
            if(minLenToMid==lenToMid[i]) System.out.println(max+" "+ints[i]);
        }
    }
}
