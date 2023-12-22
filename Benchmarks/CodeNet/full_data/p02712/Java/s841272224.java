import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        long N = sn.nextInt();
        long result = 0;

        for(int i=1; i<=N; i++){
            if(i%3 == 0 | i%5 == 0){
                continue;
            }else{
                result += i;
            }
        }

        System.out.println(result);
    }
}