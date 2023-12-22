import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int ans = 0;
        int mem=1;
        for(int i=0;i<N;i++){
            int b = scan.nextInt();
            if(mem==b){
                mem++;
            }else{
                ans++;
            }
        }
        ans  = (ans==N)?-1:ans;
        System.out.println(ans);
    }
}
