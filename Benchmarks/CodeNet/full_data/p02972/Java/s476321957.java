import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> li = new ArrayList<Integer>();
        for(int i = 0; i < n; i++){
            li.add(sc.nextInt());
        }
        int cnt = 0;
        int[] ans = new int[200001];
        for(int i = 0; i < n; i++){
            int now = n-i;
            int tmp = 0;
            for(int j = 2; j <= n; j++){
                if(j * now > n){
                    break;
                }else if(ans[j*now] == 1){
                    tmp++;
                }
            }
            if((li.get(now-1)+tmp)%2 == 1){
                cnt++;
                ans[now]++;
            }
        }
        System.out.println(cnt);
        for(int i = 1; i <= n; i++){
            if(ans[i] == 1){
                System.out.print(i+" ");
            }
        }
    }
}