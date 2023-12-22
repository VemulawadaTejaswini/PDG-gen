import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] sl = new int[n];
        int total = 0;
        for(int i = 0 ; i < n; i++){
            sl[i] = sc.nextInt();
            total += sl[i];
        }
        if(total % 10 != 0){
            System.out.println(total);
        }else{
            Arrays.sort(sl);
            int ans = 0;
            for(int s : sl){
                if(s % 10 != 0){
                    ans = total - s;
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}
