import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String S = scan.next();

        char[] array = S.toCharArray();

        if(array[0] == array[1] && array[2] == array[3] && array[1] != array[2]){

            System.out.println("Yes");
            return;

        }else if(array[0] == array[2] && array[1] == array[3] && array[1] != array[2]){

            System.out.println("Yes");
            return;

        }else if (array[0] == array[3] && array[1] == array[2] && array[0] != array[1]){

            System.out.println("Yes");
            return;
        }
        
        System.out.println("No");
        return;

    }
}