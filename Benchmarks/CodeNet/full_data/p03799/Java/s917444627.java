import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Scanner sc = new Scanner(System.in);
    long N = sc.nextInt();
    long M = sc.nextInt();

    long basic = Math.min(N,M / 2);
    long c = M - basic * 2;

    basic += c / 4;
    System.out.println(basic);
    }










    public static Integer min(List<Integer> ar){
        int min = 10000;
        int index = 0;
        for(int i = 0; i< ar.size();i++){
            if(min > ar.get(i)){
                min = ar.get(i);
                index = i;
            }
        }
        return min;
    }
}
