import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if(str.matches("A[a-z](?=[a-zC]{1,7})[a-z]*C[a-z]*[a-z]$")){
            System.out.println("AC");
        }
        else{
            System.out.println("WA");
        }
    }
}