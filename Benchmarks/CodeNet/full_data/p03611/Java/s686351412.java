import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        int ans = 0;
        for(int i = 0;i < n;i++)
            num[i] = sc.nextInt();
        Arrays.sort(num);
        
        for(int i = 0;i < n;i++){
            int sta = num[i];
            int tmp = 0;
            for(int j = 0;j < n;j++){
                if(sta == num[j]-1 || sta == num[j] || sta == num[j]+1)
                    tmp++;
            }
            if(ans < tmp)
                ans = tmp;
        }

        System.out.println(ans);
    }
}