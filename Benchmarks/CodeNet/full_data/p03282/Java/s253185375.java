import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String S = scan.next();
        long K = Long.parseLong(scan.next());

        for(int i = 0; i < S.length()-1; i++) { 
            
            if (!S.substring(i, i + 1).equals(S.substring(i + 1, i + 1 + 1))) {
                    
                if(K <= i+1){ 
                    System.out.println(S.substring(i, i+1));
                    return;
                }else{
                    System.out.println(S.substring(i + 1, i + 1 + 1));
                    return;
                }
            }
        }

        System.out.println(1);
    }
}