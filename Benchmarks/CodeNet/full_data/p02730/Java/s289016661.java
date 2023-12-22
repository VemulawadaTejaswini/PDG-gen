import java.util.*;

public class Main {


    public static void main(String [] commandLineArgument){

        Scanner input = new Scanner(System.in);
        String s = input.next();
        int n = s.length();
        int l = 0 , r = n - 1;
        if(!isPalindrome(s , l , r)){
            System.out.println("No");
            return;
        }
        l = 0 ;
        r = ((n - 1)/2) - 1;
        if(!isPalindrome(s , l , r)){
            System.out.println("No");
            return;
        }

        l = ((n + 3)/2) - 1;
        r = n - 1;
        if(!isPalindrome(s , l , r)){
            System.out.println("No");
            return;
        }
        System.out.println("Yes");
        input.close();
    }

    public static boolean isPalindrome(String s , int l , int r ){
        while(l < r){
            if(s.charAt(l++) != s.charAt(r--)){
                return false;
            }
        }
        return true;
    }
}

