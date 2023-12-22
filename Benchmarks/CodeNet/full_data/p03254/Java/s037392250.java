import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x= sc.nextInt();
        int[] a = new int[N];
        for(int i = 0; i < N; i++){
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);
        int ans = 0;
        for(int i = 0; i < N; i++){
            if(x - a[i] < 0) break;
            else if(x > 0){
                x -= a[i];
                ans++;
            }
        }

        if(x == 0 || ans == 0) System.out.println(ans);
        else if(x > 0) System.out.println(ans - 1);
    }
}
