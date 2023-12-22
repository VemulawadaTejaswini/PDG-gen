import java.util.Scanner;

public class Main {
    int[] nums;
    long[] preSum;
    public Main(int[] nums){
        this.nums=nums;
        int N=nums.length;
        preSum=new long[N];
        preSum[0]=nums[0];
        preSum[1]=nums[1];
        for (int i = 2; i <N ; i++) {
            preSum[i]=preSum[i-2]+nums[i];
        }
    }

    long getLeftMaxSum(int start,int blank){
        if (start>nums.length-1){
            return 0;
        }
        long ret=0;
        if (blank==0){
            ret=getSum(start,nums.length-1);
        }else{
            for (int i = start+1; i <nums.length ; i+=2) {
                ret=Math.max(ret,getSum(start,i-3)+getLeftMaxSum(i,blank-1));
            }
        }
        return ret;
    }

    long getSum(int start,int end){
        if (end<start){
            return 0;
        }else{
            return preSum[end]-preSum[start]+nums[start];
        }
    }

    long getMaxSum(){
        long max=0;
        if (nums.length %2 ==0){
            max=getLeftMaxSum(0,1);
        }else{
            max=getLeftMaxSum(0,2);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int N=scan.nextInt();
        int[] nums =new int[N];
        for (int i = 0; i <N ; i++) {
            nums[i]=scan.nextInt();
        }
        Main solve=new Main(nums);
        System.out.println(solve.getMaxSum());
    }
}