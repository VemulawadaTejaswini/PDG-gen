import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt()+1;
        int[] nums=new int[n];
        nums[0]=0;
        int output=0;
        for(int i=1;i<n;i++){
            nums[i]=sc.nextInt();
        }
        for(int i=1;i<n;i++){
            nums[i]+=nums[i-1];
        }
        Arrays.sort(nums);
        int tmp=Integer.MIN_VALUE;
        int outtmp=0;
        for(int i=0;i<n;i++){
            if(tmp==nums[i]){
               outtmp++; 
               if(i==n-1){
                   i--;
                   tmp=Integer.MIN_VALUE;
               }
            }else{
                if(outtmp>1){
                    output+=nc2(outtmp);
                }
                tmp=nums[i];
                outtmp=1;
            }
            
        }
        System.out.println(output);
        
    }
    static int nc2(int input){
        int output=1;
        output=input*(input-1)/2;
        return output;
    }
        

    

}