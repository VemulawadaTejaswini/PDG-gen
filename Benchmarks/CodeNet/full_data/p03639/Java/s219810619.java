import java.util.*;
 
public class Main {
    static final long MOD=1000000007;
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int tmp;
        int odd=0;
        int even=0;
        int even4=0;
        for(int i=0;i<n;i++){
            tmp=sc.nextInt();
            if(tmp%4==0){
                even4++;
            }else if(tmp%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println((odd<=even4)||(even==0&&odd-1<=even4)?"Yes":"No");
    }
}