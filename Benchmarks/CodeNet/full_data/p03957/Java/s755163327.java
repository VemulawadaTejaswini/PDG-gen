import java.util.Scanner;

/**
 * Created by Seiya on 2016/10/16.
 */
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        int ok = 0;
        for(int i = 0; i < s.length(); i++){
            if(ok == 0 && s.charAt(i) == 'F')ok = 1;
            if(ok == 1 && s.charAt(i) == 'C')ok = 2;

        }
        if(ok == 2){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }


}
