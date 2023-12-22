import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int total = a * b;
        if(total % 2 ==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}
