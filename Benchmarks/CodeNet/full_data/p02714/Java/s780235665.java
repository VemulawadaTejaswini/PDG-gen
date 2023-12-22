import java.util.*;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] let = sc.next().toCharArray();
        int a = 0, b = 0, c = 0;
        long ans = 0;
        for(int i = 0; i < n; i++){
            if(let[i] == 'R') a++;
            if(let[i] == 'B') b++;
            if(let[i] == 'G') c++;
        }
        ans = a * b * c;
        long sub = 0;
        for(int i = 1; i <= 2000; i++){
            for(int j = 0; j < 4000; j++){
                if(j + 2 * i >= n) break;
                if(let[j] != let[j + i] && let[j] != let[j + 2 * i] && let[j + i] != let[j + 2 * i]){
                    sub++;
                }
            }
        }
        System.out.println(ans - sub);
    }
}