import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = 0;
        

        for(int i = 1;i <= num;i++){
            int cnt = 0;
            if(i%2 != 0){
                for(int j = i;j > 0;j--){
                    if(i % j == 0){
                        cnt++;
                    }
                }
                if(cnt == 8)
                ans++;
            }
        }

        System.out.println(ans);
        
    }
}