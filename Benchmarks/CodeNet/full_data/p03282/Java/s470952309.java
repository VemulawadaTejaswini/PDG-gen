import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String S = scan.next();
        int K = Integer.parseInt(scan.next());

        if(S.length()==1) {
            System.out.println(S.substring(0, 1));
            return;
        }

        if( !S.substring(0, 1).equals("1")){
            System.out.println(S.substring(0, 1));
            return;
        }

        for(int i = 0; i < S.length(); i++) {
            if (!S.substring(i, i + 1).equals(S.substring(i + 1, i + 1 + 1))) {
                if(K == i+1){
                    System.out.println(S.substring(i, i+1));
                    return;
                }else{
                    System.out.println(S.substring(i + 1, i + 1 + 1));
                    return;
                }
            }
        }
    }
}