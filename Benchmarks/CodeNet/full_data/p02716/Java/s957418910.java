import java.util.Arrays;
import java.util.Scanner;

public class Main {
    int[] nums;
    int N;
    long[] preSum;

    public Main(int[] nums){
        this.nums=nums;
        N=nums.length;
    }
    long getMaxSum(){
        long max=0;
//      结尾一定要被取到
        long[] ext0max=new long[N];
        Arrays.fill(ext0max, -100000000000000L);
        long[] ext1max=new long[N];
        Arrays.fill(ext1max, -100000000000000L);
        long[] ext2max=new long[N];
        Arrays.fill(ext2max, -100000000000000L);
        ext0max[0]=nums[0];
        ext0max[2]=nums[0]+nums[2];
        ext1max[1]=nums[1];
        ext1max[3]=nums[3]+Math.max(nums[0],nums[1]);
        ext2max[2]=nums[2];
        for (int i = 4; i <N ; i++) {
            ext0max[i]=ext0max[i-2]+nums[i];
            ext1max[i]=Math.max(ext1max[i-2]+nums[i],ext0max[i-3]+nums[i]);
            ext2max[i]=Math.max(ext2max[i-2]+nums[i],Math.max(ext1max[i-3]+nums[i],ext0max[i-4]+nums[i]));
        }
        if (N%2==0){
            max=Math.max(ext1max[N-1],ext0max[N-2]);
        }else{
            max=Math.max(ext2max[N-1],Math.max(ext1max[N-2],ext0max[N-3]));
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
