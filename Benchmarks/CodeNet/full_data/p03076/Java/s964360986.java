import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] d = new int[5];
        int[] A = new int[5];
        int a;
        int b;
        int ans1 = 0,ans2 = 0;

        for(int i = 0;i < 5;i++){
            d[i] = sc.nextInt();
            a = d[i] % 10;
            b = 10-a;
            if(d[i]%10 == 0 || b == 0)
            continue;
            A[i] = b;
        }

        Arrays.sort(A);

        for(int i = 0;i < 4;i++){
            ans1 += A[i];
        }
        for(int i = 0;i < 5;i++){
            ans2 += d[i];
        }
        int ans = ans1 +ans2;
        System.out.println(ans);
    }
}