import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int L = Integer.parseInt(sc.next());
        int R = Integer.parseInt(sc.next());
        sc.close();
        int ans = 0;
        int temp = mod2019(L);        
        for(int i = L;i < R;i++){
            temp = Math.min(mod2019(i) , temp);
          
        }
       
        ans = mod2019(temp * (temp + 1));
        System.out.println(ans);
    }
    static int mod2019(int n){
        return n % 2019;
    }
}