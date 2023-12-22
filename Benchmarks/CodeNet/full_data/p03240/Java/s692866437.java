import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] x = new long[N];
        long[] y = new long[N];
        long[] h = new long[N];
        for(int i=0;i<N;i++){
            x[i] = sc.nextLong();
            y[i] = sc.nextLong();
            h[i] = sc.nextLong();
        }
        for(long cx=0;cx<=100;cx++){
            for(long cy=0;cy<=100;cy++){
                int start = 0;
                while(h[start]==0) start++;
                long H = h[start]+Math.abs(x[start]-cx)+Math.abs(y[start]-cy);
                boolean flag = true;
                for(int j=start+1;j<N;j++){
                    if(h[j]==0) continue;
                    long curH = h[j]+Math.abs(x[j]-cx)+Math.abs(y[j]-cy);
                    flag = flag&(curH==H);
                }
                if(flag==true){
                    System.out.println(Long.toString(cx)+" "+Long.toString(cy)+" "+Long.toString(H));
                    System.exit(0);
                }
            }
        }
        for(long cx=0;cx<=100;cx++){
            for(long cy=0;cy<=100;cy++){
                boolean flag = true;
                for(int i=0;i<N;i++){
                    flag = flag&(Math.abs(cx-x[i])+Math.abs(cy-y[i])>=1);
                }
                if(flag){
                    System.out.println(Long.toString(cx)+" "+Long.toString(cy)+" "+Long.toString(1));
                    System.exit(0);
                }
            }
        }
    }
}