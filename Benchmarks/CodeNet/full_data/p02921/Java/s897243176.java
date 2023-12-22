import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        
        String[] splitS = S.split("", 0);
        String[] splitT = T.split("", 0);
        
        int match = 0;
        
        for(int i = 0; i < splitS.length; i++){
            if(splitS[i].equals(splitT[i])){
                match++;
            }
        }
        
        System.out.println(match);
    }
}