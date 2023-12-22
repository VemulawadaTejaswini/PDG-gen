import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        String T = scanner.nextLine();
        String rotatedString = S;
        if(S.equals(T)){System.out.println("Yes"); return;}
        for(int x = S.length() - 1; x>0; x--){
            rotatedString = S.substring(x,x+1) + rotatedString.substring(0,S.length()-1);
            if(rotatedString.equals(T)){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");


    }

}
