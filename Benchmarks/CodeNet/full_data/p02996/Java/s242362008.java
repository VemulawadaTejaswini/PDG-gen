import java.util.*;


class Main{
    static long mod = 1000000007;
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        int[][] A = new int[N][2];
        for(int i=0;i<N;i++){
            A[i][0] = sc.nextInt();
            A[i][1] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(A, (a,b) -> a[1]-b[1]);
        //dump(A);

        long time = 0;
        for(int i=0;i<N;i++){
            time += A[i][0];
            if(time>A[i][1]){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");


    }

    public static void dump(int[][] a) {
        for(int i=0;i<a.length;i++){
            System.out.println(a[i][0] + " " + a[i][1]);
        }
        return;
    }
}