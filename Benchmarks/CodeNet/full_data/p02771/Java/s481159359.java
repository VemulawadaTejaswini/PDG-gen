import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        
        if((A==B && A!=C) || (A!=B && A==C)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
