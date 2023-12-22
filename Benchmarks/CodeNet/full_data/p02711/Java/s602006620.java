import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean seven = false;
        if(n/100 == 7){
            seven = true;
        }
        if(((n/10) % 10) == 7){
            seven = true;
        }
        if((n % 10) == 7){
            seven = true;
        }
        System.out.println(seven ? "Yes" : "No");
    }
}
