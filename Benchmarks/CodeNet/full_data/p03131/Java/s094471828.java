import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        long a = sc.nextInt();
        long b = sc.nextInt();

        long ans = 1;
        long money = 0;
        if(a + 2 < b){
            for(int i = k; 0 < i; i--){
                if(1 <= money){
                    ans += b;
                    money--;
                }else{
                    if(1 < i){
                        if(ans >= a){
                            ans -= a;
                            money++;
                        }else{
                            ans++;
                        }
                    }else{
                        ans++;
                    }
                }
            }
        }else{
            ans += k;
        }
        System.out.println(ans);

    }
}
