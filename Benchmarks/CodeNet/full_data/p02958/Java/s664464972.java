import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        int cnt = 0;

        for(int i = 0;i < n;i++){
            p[i] = sc.nextInt();
        }

        for(int i = 0;i < n;i++){
            for(int j = 0;j < n-1;j++){
                if(p[j] > p[j+1]){
                    int tmp = p[j];
                    p[j] = p[j+1];
                    p[j+1] = tmp;
                    cnt++;
                }
            }
        }

        System.out.println(cnt == 1||cnt == 0?"YES":"NO");
    }
}