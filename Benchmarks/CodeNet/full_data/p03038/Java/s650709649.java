import java.util.*;

class Main{
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        int[][] BC = new int[M][2];
        for(int i=0;i<M;i++){
            BC[i][0] = sc.nextInt();
            BC[i][1] = sc.nextInt();
        }
        Arrays.sort(BC, (a,b)->a[1]-b[1]);

        int j = M-1;
        while(j>=0){
            int b = BC[j][0];
            int c = BC[j][1];
            for(int i=b-1;i>=0;i--){
                if(A[i] < c)break;
                b=i;
            }
            if(b==0)break;
            for(int i=0;i<b;i++){
                A[i] = c;
            }
            Arrays.sort(A);
            j--;
        }
        long total = 0;
        for (int var : A) {
            total += var;
        }
        System.out.println(total);
    }
}