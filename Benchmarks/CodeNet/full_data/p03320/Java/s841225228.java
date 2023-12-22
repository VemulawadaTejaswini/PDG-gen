import java.util.*;
public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        int reSum = 0;
        int sum = 0;
        int count = 0;
        int index = 1;

        while(count < k){
            if(count < 9) {
                System.out.println(index);
                count ++;
            }else{
                sum = sumDigits(index);
                if(sum <= reSum) {
                    System.out.println(index-1);
                    count++;
                }
                reSum = sumDigits(index);
            }
            index ++;

        }



    }
    public static int sumDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }


}