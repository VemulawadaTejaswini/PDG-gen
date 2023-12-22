import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        long mod = 1000000007;

        int n = stdIn.nextInt();
        
        int x = -1;
        int y = -1;
        int z = -1;
        
        int a, candidate;
        long ans = 1;
        for(int i=0; i<n; i++){
            a = stdIn.nextInt();
            candidate = 0;

            if(x == a-1){
                candidate++;
            }
            if(y == a-1){
                candidate++;
            }
            if(z == a-1){
                candidate++;
            }

            if(x == a-1){
                x++;
            }else if(y == a-1){
                y++;
            }else if(z == a-1){
                z++;
            }

            ans = ans * candidate % mod;
        }

        int noStackedCounter = 0;
        if(x == -1){
            noStackedCounter++;
        }
        if(y == -1){
            noStackedCounter++;
        }
        if(z == -1){
            noStackedCounter++;
        }

        if(noStackedCounter == 2){
            ans = ans * 1 % mod;
        }else if(noStackedCounter == 1){
            if(x == -1){
                if(y == z){
                    ans = ans * 3 % mod;
                }else{
                    ans = ans * 6 % mod;
                }
            }else if(y == -1){
                if(x == z){
                    ans = ans * 3 % mod;
                }else{
                    ans = ans * 6 % mod;
                }
            }else{
                if(x == y){
                    ans = ans * 3 % mod;
                }else{
                    ans = ans * 6 % mod;
                }
            }
        }else{
            if(x == y && y == z){
                ans = ans * 1 % mod;
            }else if(x == y || y == z || z == x){
                ans = ans * 3 % mod;
            }else{
                ans = ans * 6 % mod;
            }
        }

        System.out.println(ans);
    }
}