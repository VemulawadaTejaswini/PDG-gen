import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        int cnt = 0;

        for(int i = 0;i < n;i++){
            p[i] = sc.nextInt();
        }

        for(int i = 0;i < n;i++){
            if(p[i] != i+1)
            cnt++;
        }
        System.out.println(cnt == 0 || cnt == 2 ?"YES":"NO");
    }
}