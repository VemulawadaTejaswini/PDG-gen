import java.util.*;

public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String S = sc.next();
        sc.close();
    
        if(S.equals("AKIHABARA") || S.equals("KIHABARA") ||
            S.equals("AKIHNARA") || S.equals("AKIHABRA") ||
            S.equals("AKIHABAR") || S.equals("KIHBARA") ||
            S.equals("KIHABRA") || S.equals("KIHABAR") ||
            S.equals("AKIHBRA") || S.equals("AKIHBAR") ||
            S.equals("AKIHABR") || S.equals("KIHBRA") ||
            S.equals("AKIHBR") || S.equals("KIHABR") ||
            S.equals("KIHBARA") || S.equals("KIHBR"))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}