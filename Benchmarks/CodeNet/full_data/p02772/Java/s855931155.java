import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        boolean approved = true;
        for(int i = 0 ; i < n ; i++){
            int a = scanner.nextInt();
            if(a % 2 == 0){
                if(a % 3 == 0 || a % 5 == 0){
                    ;
                }else{
                    approved = false;
                    break;
                }
            }
        }

        System.out.println(approved ? "APPROVED" : "DENIED");

    }

}