import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int cnt = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 1 + i; j < N; j++) {
                if (A[i] == A[j]) {
                    cnt++;
                }
                
            }
        }
        String result = cnt == 0 ? "YES" : "NO"; 
        System.out.println(result);
        // if (cnt == 0) {
        //     System.out.println("YES");
        // } else {
        //     System.out.println("NO");
        // }
    }
}