import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        Boolean isCoffee = false;

        if(S.charAt(2) == S.charAt(3)){
            if(S.charAt(4) == S.charAt(5)){
                isCoffee = true;
            }
        }

        if(isCoffee){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

}







