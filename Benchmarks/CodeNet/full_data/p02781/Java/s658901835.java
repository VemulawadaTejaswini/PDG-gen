import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int sum = 0;
        long bottom = (long)Math.pow(10, k) / 10;
        long top = (long)Math.pow(10, k);
        for(long i = bottom ; i <= top && i <= n ; i++){
            if (i % 10 == 0){
                continue;
            }
            System.out.println(i);
            sum +=1;
        }
        for(long i = top ; i <= n ; i++){
            int len = (String.valueOf(i).replaceAll("0", "")).length();
            if(len == k){
                System.out.println(i);
                sum += 1;
            }
        }

        System.out.println(sum);
    }

}