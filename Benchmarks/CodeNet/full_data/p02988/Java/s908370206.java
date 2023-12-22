import java.util.*;

class Main{
    static int[] nums = new int[3];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        int cnt = 0;
        for(int i = 0; i < num; i++){
            next();
            nums[0] = sc.nextInt();
            if(i > 1){
                if(nums[1] == median3()){
                    ++cnt;
                }
            }
        }
        System.out.println(cnt);
    }

    public static int median3(){
        int[] tmpArr = {nums[0], nums[1], nums[2]};
        Arrays.sort(tmpArr);
        return tmpArr[1];
    }

    public static void next(){
        nums[2] = nums[1];
        nums[1] = nums[0];
    }
}
