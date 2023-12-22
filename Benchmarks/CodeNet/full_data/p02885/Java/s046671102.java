import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int b = sc.nextInt();
        
        if(n*2 >= b){
            System.out.println(0);
        } else {
            System.out.println(b - n*2);
        }
    }
}