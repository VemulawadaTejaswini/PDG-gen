import java.util.*;
 
public class Main {
    static final long MOD=1000000007;
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] nums=new long[2];
        for(int i=0;i<2;i++){
            nums[i]=sc.nextInt();
        }
        Arrays.sort(nums);
        if(nums[1]-nums[0]>1){
            System.out.println(0);
        }else if(nums[1]-nums[0]==1){
            System.out.println((long)(kaijo(nums[1])*kaijo(nums[0]))%MOD);
        }else{
            System.out.println((kaijo(nums[0])*kaijo(nums[1])*2)%MOD);
        }
    }
    static long kaijo(long input){
        long output=1;
        for(int i=1;i<=input;i++){
            output*=i;
            output%=MOD;
        }
        return output;
    }
}
