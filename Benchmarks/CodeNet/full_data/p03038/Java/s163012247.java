import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[] A = new int[N];
        for(int i= 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        
        Data[] BC = new Data[M];
        for(int i= 0; i < M; i++) {
            int B = sc.nextInt();
            int C = sc.nextInt();
            BC[i] = new Data(B, C);
        }
        Arrays.sort(BC, new Comparator<Data>() {
            public int compare(Data d1, Data d2) {
                return d2.getB() - d1.getB();
            }
        });

        
        int cnt = 0;
        int A_cnt = 0;
        label: while(A_cnt < N && cnt < M){
            int C = BC[cnt].getB();
            for(int i = 0; i < BC[cnt].getA(); i++){
                if(A[A_cnt] < C){
                    A[A_cnt] = C;
                    A_cnt ++;
                } else{
                    break label;
                }
            }
            cnt ++;
        }
        
        long ans = 0;
        for(int i = 0; i < N; i++){
            ans += A[i];
        }
        System.out.println(ans);
    }
}

class Data{
    private int a;
    private int b;
    public Data(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
}