import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long sum = 0;

        List<Long> list = divisor(n);
        for(long i : list){
            i--;
            if(i == 0){
                continue;
            }
            if(n / i == n % i){
                sum += i;
            }
        }

        System.out.println(sum);

    }

    public static ArrayList<Long> divisor(long n){
        ArrayList<Long> result = new ArrayList<>();
        for(long i = 1; i * i <= n; i++){
            if(n % i == 0){
                result.add(i);
                if(i != n / i){
                    result.add(n / i);
                }
            }
        }
        return result;
    }

}
