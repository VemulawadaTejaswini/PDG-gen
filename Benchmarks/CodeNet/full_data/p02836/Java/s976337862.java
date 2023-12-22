import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String[] splitS = S.split("", 0);
        int change = 0;
        
        for(int i = 0; i < splitS.length/2; i++){
            if(!splitS[i].equals(splitS[splitS.length-1-i])){
                change++;
            }
        }
        System.out.println(change);
        
    }
}