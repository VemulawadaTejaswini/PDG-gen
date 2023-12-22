import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char[] cl = sc.next().toCharArray();
        char[] chk = {'A','T','C','G'};
        int ans = 0;
        int now = 0;
        for(int i = 0; i < cl.length; i++){
            boolean bool = false;
            for(char c: chk){
                if(cl[i] == c){
                    bool = true;
                    break;
                }
            }
            if(bool){
                now++;
            }else{
                ans = Math.max(ans,now);
                now = 0;
            }
        }
        System.out.println(Math.max(ans,now));
    }
}
