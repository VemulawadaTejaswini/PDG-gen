import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int k = sc.nextInt();
        long sabu = 0;
        int cnt = 0;

        long min = Long.MAX_VALUE;

        while(true){
            long num  = Math.abs(n - k);
            
            if(n<num){
                min = n;
                break;
            }else if(sabu == n-num){  
                cnt++;
            }else if(sabu != n-num){
                cnt = 0;
            }else if(num < min){
                min = num;
            }else{
                break;
            }

            if(cnt == 3){
                min=0;
                break;
            }
            sabu = n-num;
            n = num;

        }

        System.out.println(min);
    }
}