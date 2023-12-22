import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int L = Integer.parseInt(sc.next());
        int R = Integer.parseInt(sc.next());
        sc.close();
        int ans = 0;
        int temp = 0;
        for(int i = L;i < R;i++){
            temp = Math.min(mod2019(i) , mod2019(i + 1));
        }
        ans = temp * ++temp;
        System.out.println(ans);
    }
    static int mod2019(int n){
        return n % 2019;
    }
}