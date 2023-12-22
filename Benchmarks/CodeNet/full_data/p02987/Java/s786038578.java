import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);
        String S = hi.nextLine();

        char g = S.charAt(0);
        if (S.charAt(0) == S.charAt(1)) {

            char r = S.charAt(2);
            if (S.charAt(2) == S.charAt(3))
            {
                if (S.charAt(0) == S.charAt(3))
                    System.out.println("No");
                if (S.charAt(0) != S.charAt(3))
                    System.out.println("Yes");
            }
                 else{
                    System.out.println("No");
            }
        } else if (S.charAt(0) == S.charAt(2)) {
            char r = S.charAt(2);
            if (S.charAt(1) == S.charAt(3))
            {
                if (S.charAt(0) == S.charAt(1))
                    System.out.println("No");
                if (S.charAt(0) != S.charAt(1))
                    System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }


        }else if (S.charAt(0) == S.charAt(3))
        {
            char r = S.charAt(2);
            if (S.charAt(1) == S.charAt(2))
            {
                if (S.charAt(0) == S.charAt(1))
                    System.out.println("No");
                if (S.charAt(0) != S.charAt(1))
                    System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }


        }

        else System.out.println("No");
    }


}
