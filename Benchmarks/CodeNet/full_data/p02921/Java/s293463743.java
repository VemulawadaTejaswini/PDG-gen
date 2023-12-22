import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        String T = scanner.next();

        char[] schar = S.toCharArray();
        char[] tchar = T.toCharArray();

        int answer = 0;
        for(int i=0; i<3; i++){
            if(schar[i] == tchar[i]){
                answer++;
            }
        }

        System.out.println(answer);
    }
}