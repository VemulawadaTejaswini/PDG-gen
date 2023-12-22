import java.util.*;
public class Main {

   static String ans = "";


    private static void triplet(String first, String rest){

        int first_digit = Integer.parseInt(first);
        int second_digit = Integer.parseInt(rest.substring(0,1));

        if(first_digit < second_digit){

            int d = first_digit+1;
            ans = ans.concat(Integer.toString(d));
            ans = ans.concat(Integer.toString(d));
            ans = ans.concat(Integer.toString(d));
            return;

        }else if(first_digit == second_digit){

            if(rest.length() == 1){

                ans = ans.concat(Integer.toString(first_digit));
                ans = ans.concat(Integer.toString(first_digit));
                ans = ans.concat(Integer.toString(first_digit));
                return;

            }else{

                triplet(rest.substring(0,1), rest.substring(1));
                return;
            }

        }else if(first_digit > second_digit){

            int d = first_digit;
            ans = ans.concat(Integer.toString(d));
            ans = ans.concat(Integer.toString(d));
            ans = ans.concat(Integer.toString(d));
            return;
        }

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String N = scan.next();

        triplet(N.substring(0,1), N.substring(1));

        System.out.println(ans);
    }
}