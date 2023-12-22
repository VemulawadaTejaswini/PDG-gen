import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next(); //文字列a
        int A = Integer.parseInt(a); //数字A
        String b = scanner.next(); //文字列b
        int B = Integer.parseInt(b); //数字B
        
        String a_sum = "";
        String b_sum = "";
        
        for(int i=0; i<B; i++){
            a_sum = a_sum +a;
        }
        
        for(int i=0; i<A; i++){
            b_sum = b_sum +b;
        }
        
        int A_sum = Integer.parseInt(a_sum);
        int B_sum = Integer.parseInt(b_sum);
        
        if(A<=B){
            System.out.println(A_sum);
        }else{
            System.out.println(B_sum);
        }
        
    }
}
