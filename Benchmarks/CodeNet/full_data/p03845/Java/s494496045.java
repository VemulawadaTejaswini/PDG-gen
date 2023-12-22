import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int nums[] = new int [N];
        int total = 0;
        for(int i = 0;i < N;i++){
            nums[i] = sc.nextInt();
            total += nums[i];
        }
        int M = sc.nextInt();
        int Pm[] = new int [M];
        int Xm[] = new int [M];
        for(int i = 0;i < M; i++){
            Pm[i] = sc.nextInt() - 1;
            Xm[i] = sc.nextInt();
        }
        
        for(int i = 0;i < M;i++){
            System.out.println(total - (nums[Pm[i]] - Xm[i]));
        }
    }
}
