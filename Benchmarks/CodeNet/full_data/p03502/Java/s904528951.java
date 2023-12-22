import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();//与えれる整数
       int total = 0;
       String arrays[] = null;
       String kazu_string = String.valueOf(N);
       arrays =  kazu_string.split("");
       for(int i = 0; i < arrays.length; i++) {
            total += Integer.parseInt(arrays[i]);
        }
        if((N % total) == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
