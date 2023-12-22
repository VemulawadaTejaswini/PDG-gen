import java.util.*;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean res = true;
        for(int i=0; i<n; i++) {
            int a = sc.nextInt();
            if(a % 2 == 0) {
                if(a % 5 != 0 && a % 3 != 0) {
                    res = false;
                    break;
                }
            }
        }

        System.out.println(res ? "APPROVED" : "DENIED");
    }



}
