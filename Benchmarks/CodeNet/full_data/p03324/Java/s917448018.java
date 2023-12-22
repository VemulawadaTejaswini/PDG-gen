import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int n = sc.nextInt();

        long[] number = new long[n];
        for(int i = 1;i<=n;i++){
            if(d == 0){
                number[i-1] = i;
            }else{
                number[i-1] =i*(long)Math.pow(100,d);
            }
        }
        System.out.println(number[n-1]);
    }
}