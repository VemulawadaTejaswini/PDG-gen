import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int sum = A + B;
        int diff = A - B;
        int multiply = A * B; 
        int max;
        
        if(sum >= diff){
            max = sum;
        }else if(diff >= multiply){
            max = diff;
        }else{
            max = multiply;
        }
        System.out.println(max);
    }
}
 