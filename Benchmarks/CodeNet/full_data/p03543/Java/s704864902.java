// writed 2020/03/25
// bit全探索
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        String numString = String.valueOf(num);
        String[] nums = numString.split("");
        int numsInt[] = new int[4];

        for(int x=0;x<nums.length;x++) {
            numsInt[x] = Integer.parseInt(nums[x]);
        }
        
        int opnum = 3;

        for(int i=0;i<(1<<opnum);i++) {
            int sum = numsInt[0];
            int count = 0;
            StringBuilder sb = new StringBuilder(numString);
            for(int j=0;j<opnum;j++) {
                if((1&i>>j) == 1) {
                    sum += numsInt[j+1];
                    sb.insert(j+1+count, "+");
                    count++;
                }else {
                    sum -= numsInt[j+1];
                    sb.insert(j+1+count, "-");
                    count++;
                }
            }
            if(sum==7) {
                System.out.println(sb.toString() + "=7");
                return;
            }
        }
    }
}