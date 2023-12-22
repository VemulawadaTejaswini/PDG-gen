import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;
class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int sum = scan.nextInt();
        int choose = scan.nextInt();
        int total = 0;
        Integer num[] = new Integer[sum];
        for(int i = 0; i < sum; i++){
            num[i] = scan.nextInt();
            total = total + num[i];
        }
        Arrays.sort(num,Collections.reverseOrder());

        if(total/(4 * choose) <= num[choose-1]){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}