import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int ans = 0;
        for(char c : s){
            if(c == '+'){
                ans++;
            }else{
                ans--;
            }
        }
        System.out.println(ans);
    }
}
