import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[100000];
        for(int i=0;i<n;i++){
            nums[sc.nextInt()-1]++;
        }
        int output=0;
        for(int i=100000;i>0;i--){
            if(nums[i-1]>=4&&output==0){
                System.out.println(i*i);
                return;
            }else if(nums[i-1]>=2&&output!=0){
                System.out.println(output*i);
                return;
            }else if(nums[i-1]>=2){
                output=i;
            }
        }
        System.out.println(0);
    }
 
    
}