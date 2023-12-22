import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        double sum = 0;

        int base = 0;
        if (n>k){
            base = k;
        }
        else{
            base = n;
        }

        for (int i=1;i<=n;i++){
            int g = log(i,k);
            int check = (int) Math.pow(2,g)*n;
            sum += (double) 1/check;
        }

        System.out.println(sum);


    }

    static int log(int n,int k){
        int sum = 0;
        while (n<k){
            n *= 2;
            sum += 1;
        }
        return sum;
    }
}