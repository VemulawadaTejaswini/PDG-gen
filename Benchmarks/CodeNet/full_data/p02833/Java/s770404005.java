import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int num = s.nextInt();
        int sum1 = 0;
        int sum2 = 0;

        for(int i =1; i<num ;i++) {
            if (i % 2 == 0) {
              sum1+= i;
            }
            else if (i % 2 != 0){
                sum2 += i;
            }
        }

        if ((!(sum1< Math.pow(10, 18))) || (!(sum2 < Math.pow(10, 18)))) {
            if (num % 2 == 0){
                System.out.println(sum1);
            }else {
                System.out.println(sum2);
            }

        }
        
    }
}
