import java.util.*;


class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] X = new int[N];
        for(int i=0; i<N; i++){
            X[i] = sc.nextInt();
        }

        int[] d = new int[100];
        for(int i=0; i<100; i++){
            d[i] = i*i;
        }

        int min = Integer.MAX_VALUE;
        for(int i=0; i<100; i++){
            int dsum = 0;
            for(int j=0; j<N; j++){
                dsum += d[Math.abs(i-(X[j]-1))];
            }
            if(dsum < min) min = dsum;
        }

        System.out.println(min);
    }
}