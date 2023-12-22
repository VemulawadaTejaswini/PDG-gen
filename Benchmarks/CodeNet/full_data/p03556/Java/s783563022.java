import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num = 0;
        num = (int)Math.sqrt(N);
        int ans = 0;
        int total = 0;
        for(int i =1; i < num+1; i++){
            ans = i * i;
        }
        if(ans == N){
            System.out.println(ans);
        }else{
            total = ans;
            }
        System.out.println(total);
    }
}