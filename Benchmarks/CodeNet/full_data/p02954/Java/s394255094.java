import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int[] nums = new int[S.length()];

        int count=0;
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if(c=='R'){
                count++;
            }else if(count>0){// L ,set values
                nums[i-1] += (int)Math.ceil(count/2.0);
                nums[i] += count - nums[i-1];
                count=0;
            }
        }

        for (int i = S.length()-1 ; i >=0; i--) {
            char c = S.charAt(i);
            if(c=='L'){
                count++;
            }else if(count>0){// at R ,set values
                int countL = (int)Math.ceil(count/2.0);
                nums[i+1] += countL;
                nums[i] += count - countL;
                count=0;
            }
        }


        for (int i = 0; i < S.length(); i++) {
            System.out.print(nums[i]+((i==S.length()-1)?"\n":" "));
        }

    }
}
