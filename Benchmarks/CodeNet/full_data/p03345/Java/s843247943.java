import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
       Scanner sc = new Scanner(System.in);
       long a = sc.nextLong();
       long b = sc.nextLong();
       long c = sc.nextLong();
       long k = sc.nextLong();
       long[] number = {a,b,c};
       long[] tmp = new long[3];
       
       for(int i = 0; i < k; i++){
            tmp[0] = number[1] + number[2];
            tmp[1] = number[0] + number[2];
            tmp[2] = number[0] + number[1];
            if(i == k-1 || i % (number.length-1) == 0 ){
                number[0] = tmp[0];
                number[1] = tmp[1];
                number[2] = tmp[2];
            }
       }
       if(Math.abs(number[0] - number[1]) > Math.pow(10,18)){
           System.out.println("Unfair");
       }else{
           System.out.println(number[0] - number[1]);
       }
    }
}