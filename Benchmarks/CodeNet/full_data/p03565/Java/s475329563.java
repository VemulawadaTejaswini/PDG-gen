import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String S = scan.nextLine();
        String T = scan.nextLine();
        boolean flag = false;
        int count = 0;
        for(int i = S.length()-T.length(); i >= 0; i--){
            count = 0;
            for(int j = 0; j < T.length(); j++){
                //System.out.println("index : " + (i+j));
                if(S.charAt(i+j) == T.charAt(j) || S.charAt(i+j) == '?'){
                    count++;
                }
            }
            if(count == T.length()){
                S = S.substring(0, i)+T;
                flag = true;
                break;
            }
        }
        
        if(flag){
            S = S.replace("?", "a");
            System.out.println(S);
        }else{
            System.out.println("UNRESTORABLE");
        }
        
    }
}