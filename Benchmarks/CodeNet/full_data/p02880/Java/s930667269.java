import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n;
        String result = "No";
        
        n = sc.nextInt();
        
        for(int i = 1; i < 10; i++){
            if((n / i < 10) && (n % i == 0)){
                result = "Yes";
                break;
            }else{
                result = "No";
            }
        }
        
        System.out.println(result);
    }
}
