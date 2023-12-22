public class Main {

    public static void main(String[] args) {
        int[] nums = {5,7,7};

        int cnt1 = 0;
        int cnt2 = 0;

        for(int i =0; i < nums.length; i++){
            if(nums[i]==5){
                cnt1 ++;
            }
            else if(nums[i]==7){
                cnt2 ++;
            }
            else{
                break;
            }
        }

        if(cnt1 ==2 && cnt2 ==1){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}

