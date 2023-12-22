import java.util.*;

class Main{
    static int[] nums = new int[3];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        int cnt = 0;
        for(int i = 0; i < num - 2; i++){
            next();
            nums[0] = sc.nextInt();
            if(i > 1){
                if(median3() == nums[1]){
                    ++cnt;
                }
            }
        }
        System.out.println(cnt);
    }

    public static int median3(){
        Arrays.sort(nums);
        return nums[1];
    }

    public static void next(){
        nums[2] = nums[1];
        nums[1] = nums[0];
    }


}
